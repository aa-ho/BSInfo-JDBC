import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC02DML {

	public static void main(String[] args) {
		System.out.println("Execute DML");
		System.out.println("====================");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "guest", "Pa$$w0rd");
			
			if (connection != null) {
				System.out.println("Connection established!");
			} else {
				System.out.println("Could not establish connection!");
				return;
			}
			
			Statement statement = null;
			//1. Erzeugen eines Datensatzes in der Tabelle employees
			/*
			 * TODO
			 */
			String sql = "TODO";
			
			if (connection != null && !connection.isClosed()) {
				connection.close();
				System.out.println("Connection closed");
			}
			if (statement != null && !statement.isClosed()) {
				statement.close();
				System.out.println("Statement closed");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC-Treiber not found!\n");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("You have an SQL Syntax error");
			e.printStackTrace();
		}
	}
}
