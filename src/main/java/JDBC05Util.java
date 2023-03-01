
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBC05Util {

	private static Connection connection = null;

	public static Connection getConnection(final String db) throws SQLException, ClassNotFoundException, IOException {
		/*
		 * TODO 
		 */
		//1. Implementieren Sie eine Methode, die ein Connection-Objekt zurückgibt.
		//Die Verbindungsdaten werden aus der Properties-Datei gelesen.
		//Die Methode soll im Single-Pattern implementiert werden.

	}

	public static void close(final AutoCloseable obj) {
		/*
		 * TODO 
		 */
		//1. Implementieren Sie eine Methode, die jedes Objekt, dass das AutoCloseable Interface implementiert
		//schließen kann.
	}
}
