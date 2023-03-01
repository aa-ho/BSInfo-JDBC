import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC06PreparedStatements {
	
	public static void main(final String[] args) {
		System.out.println("JDBC Prepared Statements");
		System.out.println("========================");
		
		Connection connection = null;
		PreparedStatement pst = null;
		
		try {
			// 1. Holen einer Connection
			connection = JDBC05Util.getConnection("demoDB");
			// 2. Prepared Statement erzeugen
			pst = connection.prepareStatement("SELECT * FROM employee WHERE lastName=? AND firstName=?");
			// 3. Werte zuweisen
			// TODO
			// 4. Metadaten ermitteln
			// TODO
			// 5. Resultset ausgeben
			// TODO
		} catch (SQLException | ClassNotFoundException | IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			JDBC05Util.close(pst);
			JDBC05Util.close(connection);
		}
	}
}
