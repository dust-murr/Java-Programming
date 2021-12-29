import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SQLConsoleDemo extends Application {
	protected SQLConsolePane pane = new SQLConsolePane();
	protected Connection connection;
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws SQLException, ClassNotFoundException {
		
		initializeDatabaseConnection();
		
		//Set text area and text field defaults
		pane.ta.setEditable(false);
		pane.ta.setWrapText(true);
		pane.tf.setEditable(true);
		
		//Create listeners for buttons
		pane.btFire.setOnAction(e -> {
			String sqlStatement = pane.tf.getText();
			
			if(sqlStatement.trim().toUpperCase().startsWith("SELECT")) {
				try {
					executeSelectStatement(sqlStatement);
					
				} catch (SQLException ex) {
					System.out.println("Database Error");
				}
			}
			
			else {
				try {
				String sqlType = sqlStatement.trim().toUpperCase();
				executeUpdateStatement(sqlStatement);
				pane.ta.setText("Query: \n\t" + sqlType + "\nExecuted Successfully");
				} catch (SQLException ex) {
					pane.ta.setText("Query Update Failed");
				}
			}
		});
		
		pane.btClear.setOnAction(e -> {
			pane.tf.clear();
			pane.ta.clear();
		});		
		
		//Create a scene and place our address book into it
		Scene scene = new Scene(pane, 800, 600);
		primaryStage.setTitle("SQL Console"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	private void executeUpdateStatement(String sqlStatement) throws SQLException {
		//Create a statement
		Statement statement = connection.createStatement();
		statement.executeUpdate(sqlStatement);
	}

	private void executeSelectStatement(String sqlStatement) throws SQLException {
		
		//Create a statement
		Statement statement = connection.createStatement();
		
		//Execute query
		ResultSet resultSet = statement.executeQuery(sqlStatement);
		
		//CREATE META OBJECT
		ResultSetMetaData rsmd = resultSet.getMetaData();
		
		//PRINT ROW HEADERS
		int resultColumnCount = rsmd.getColumnCount();
		System.out.println("Number of columns " + resultColumnCount);
		
		String resultsString = "";

		for(int i = 1; i <= resultColumnCount; i++) {				
			resultsString += String.format("%-25s", rsmd.getColumnName(i));
		}
		
		resultsString += "\n";
		
		while(resultSet.next()) {		
			for(int i = 1; i <= resultColumnCount; i++) {
				resultsString += String.format("%-25s", resultSet.getString(i));
			}
		resultsString += "\n";
		}
		pane.ta.setText(resultsString);
	}

	public void initializeDatabaseConnection() throws SQLException, ClassNotFoundException {
		try {
			//Load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
								
			//Establish a connection
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabook", "scott", "tiger");
			System.out.println("Database Connected");			
		}
		catch (SQLException ex) {
			System.out.println("Database Error");
		}
		catch(ClassNotFoundException ex) {
			System.out.println("Driver Error");
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
