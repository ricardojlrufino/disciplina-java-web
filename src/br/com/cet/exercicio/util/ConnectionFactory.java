package br.com.cet.exercicio.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		
		// Forçar carregamento do Driver... (opcional..)
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("Hsqldb Driver Not Found", e);
		}
		
		try {
			return DriverManager.getConnection("jdbc:hsqldb:file:data/mydatabase;shutdown=true", "SA","");
		} catch (SQLException e) {
			throw  new RuntimeException(e);
		}
		
	}

}
