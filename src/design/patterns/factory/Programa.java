package design.patterns.factory;

import java.sql.Connection;
// import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Programa {
	
	public static void main(String[] args) throws SQLException {
		/* PROBLEMA: Toda vez que quisermos consumir o banco de dados precisaremos conseguir
			um Connection para usar. Mas se houver alteração no usuário ou senha do banco de 
			dados, precisaremos mudar em diversos pontos da aplicação para que ela volte a 
			funcionar.
			
			Vamos isolar este código em um lugar e caso acontece alterações nas suas informações de
			acesso essas seram propagadas por toda a aplicação. Este lugar será uma classe cuja a
			sua única responsabilidade é entregar para nós uma Connection. 
		
		// Exemplo de conexão com o banco de dados.
		// DriverManager.getConnection retorna uma conexão com o banco de dados da url informada
		//	por parâmetro.
		Connection conn = DriverManager.getConnection("jbdc:mysql://localhost/banco", "root", "123");
		*/
		
		// Agora o programa não precisa conhecer os dados para conectar no banco de dados.
		Connection conn = new ConnectionFactory().getConnection();
		
		PreparedStatement ps = conn.prepareStatement("select * from tabela");
		// ...
	}

}
