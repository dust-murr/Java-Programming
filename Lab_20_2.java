import java.sql.*;




public class Lab_20_2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		//Establish a connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javabook", "scott", "tiger");
		System.out.println("Database Connected");
		
		//Create a statement
		Statement statement = connection.createStatement();
		
		//Insert some data into the student table
		//insertStudentTable(statement);
		
		//Read the student table
		readStudentTable(statement);
		
		//Use a prepared statement
		//PreparedStatement pStatement = prepareQuery(connection);
		//String[] queryParameters = getQueryParameters();
		//usePreparedStatement(pStatement, queryParameters);
		
		//Using a callable statement 
		CallableStatement callableStatement = prepareCallableStatement(connection);
		String[] arguments = getCallableArguments();
		useCallableStatement(callableStatement, arguments);
		
	}

	private static void useCallableStatement(CallableStatement callableStatement, String[] arguments) throws SQLException {
		callableStatement.setString(2, arguments[0]);
		callableStatement.setString(3, arguments[1]);
		
		callableStatement.registerOutParameter(1, Types.INTEGER);
		
		callableStatement.execute();
		
		if(callableStatement.getInt(1) >= 1) {
			System.out.println(arguments[0] + " " + arguments[1] + " is in the database.");
		} else {
			System.out.println(arguments[0] + " " + arguments[1] + " is not in the database.");
		}
	}

	private static String[] getCallableArguments() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] parameters = new String[2];
		
		System.out.println("Enter Student's first and last name: ");
		parameters[0] = input.next();
		parameters[1] = input.next();
		
		input.close();
		
		return parameters;
	}

	private static CallableStatement prepareCallableStatement(Connection connection) throws SQLException {
		
		return connection.prepareCall("{? = call studentFound(?, ?)}");
	}

	private static void usePreparedStatement(PreparedStatement pStatement, String[] queryParameters) throws SQLException {
		pStatement.setString(1, queryParameters[0]);
		pStatement.setString(2, queryParameters[1]);
		
		ResultSet rset = pStatement.executeQuery();
		
		if(rset.next()) {
			System.out.println(
					rset.getString(1) + "\t" +
					rset.getString(2) + "\t" +
					rset.getString(3) + "\t" +
					rset.getString(4) + "\t" +
					rset.getString(5) + "\t"
					);
		} else {
			System.out.println("Data not found");
		}
	}

	private static String[] getQueryParameters() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] parameters = new String[2];
		//Can use: '123456789' & '12345'
		System.out.println("Enter SSN and course ID: ");
		parameters[0] = input.next();
		parameters[1] = input.next();
		
		input.close();
		
		return parameters;
	}

	private static PreparedStatement prepareQuery(Connection connection) throws SQLException {
		String queryString = "SELECT firstName, mi, lastName, title, grade " + 
								"FROM Student NATURAL JOIN Enrollment NATURAL JOIN Course " +
								"WHERE Student.ssn = ? " +
								"AND Enrollment.courseId = ? " +
								"AND Enrollment.courseId = Course.courseId";
		return connection.prepareStatement(queryString);
	}

	private static void readStudentTable(Statement statement) throws SQLException {
		//Create a results object
		ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
		
		//Create a result set meta object
		ResultSetMetaData rsmd = resultSet.getMetaData();
		
		//Print the row headers
		System.out.println(
				String.format("%-25s", rsmd.getColumnName(2)) +
				String.format("%-25s", rsmd.getColumnName(4)) +
				String.format("%-25s", rsmd.getColumnName(6)) +
				String.format("%-15s", rsmd.getColumnName(7)) +
				String.format("%-5s", rsmd.getColumnName(8))
				);
		
		//Iterate through our data
		while(resultSet.next()) {
			System.out.println(
					String.format("%-25s", resultSet.getString(2)) +
					String.format("%-25s", resultSet.getString(4)) +
					String.format("%-25s", resultSet.getString(6)) +
					String.format("%-15s", resultSet.getString(7)) +
					String.format("%-5s", resultSet.getString(8))
					);
		}
		
	}

	private static void insertStudentTable(Statement statement) throws SQLException {
		statement.executeUpdate(
			"INSERT INTO student VALUES ('987654321', 'Dustin', 'M', 'Murry', '1988-06-27', '27 Stetson Place', '15551234567', '08851', 'CS24')"
		);
		
	}

}
