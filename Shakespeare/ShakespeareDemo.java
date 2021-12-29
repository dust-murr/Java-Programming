import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ShakespeareDemo extends Application {
	
	protected ShakespearePane pane = new ShakespearePane();
	protected ShakespeareQuote line = new ShakespeareQuote();

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) throws IOException {
		
		//Set text area defaults
		pane.ta.setEditable(false);
		
		//Create listeners for buttons
		pane.btLear.setOnAction(e -> {
			pane.text.setText(pane.btLear.getText());
			try {
				line.Quotes("script/lear.txt");
				pane.ta.setText(line.getSaying());
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}	
		});
		
		pane.btMacbeth.setOnAction(e -> {
			pane.text.setText(pane.btMacbeth.getText());
			try {
				line.Quotes("script/macbeth.txt");
				pane.ta.setText(line.getSaying());
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}	
		});
		
		pane.btHamlet.setOnAction(e -> {
			pane.text.setText(pane.btHamlet.getText());
			try {
				line.Quotes("script/hamlet.txt");
				pane.ta.setText(line.getSaying());
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}	
		});
		
		pane.btRichard.setOnAction(e -> {
			pane.text.setText(pane.btRichard.getText());
			try {
				line.Quotes("script/richard.txt");
				pane.ta.setText(line.getSaying());
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}	
		});
		
		pane.btOthello.setOnAction(e -> {
			pane.text.setText(pane.btOthello.getText());
			try {
				line.Quotes("script/othello.txt");
				pane.ta.setText(line.getSaying());
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}	
		});

		//Create a scene and place pane into it
		Scene scene = new Scene(pane, 455, 175);
		primaryStage.setTitle("Dustin Murry"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
