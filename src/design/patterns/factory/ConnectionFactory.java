package design.patterns.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	// Cria a conexão com o banco de dados e retorna.
	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "1234");
			// Agora ficou simples trocar o banco por exemplo, só precisar fazer as alterações abaixo:
			// return DriverManager.getConnection("jdbc:postgres://localhost/banco", "root", "1234");
			// E esta alteração será propagada para todo o programa.
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
