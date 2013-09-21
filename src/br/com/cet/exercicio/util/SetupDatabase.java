package br.com.cet.exercicio.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SetupDatabase {
	
	private static Connection connection;
	
	static{
		connection = new ConnectionFactory().getConnection();
	}
	
	public static void main(String[] args) throws SQLException {
		 create();
		list();
	}
	
	public static void create() throws SQLException{
		connection.createStatement().executeUpdate("create table Produto (id IDENTITY, descricao varchar(45), preco varchar(45))");
		connection.createStatement().executeUpdate("insert into Produto values (null,'notebook cce', '1.200')");
		connection.createStatement().executeUpdate("insert into Produto values (null,'notebook i5', '1.500')");
	}
	
	public static void list() throws SQLException{
		ResultSet resultSet = connection.createStatement().executeQuery("select * from Produto");
		
		while(resultSet.next()){
			long id = resultSet.getLong("id");
			String descricao = resultSet.getString("descricao");
			String preco = resultSet.getString("preco");
			System.out.println("ID:" + id + " - descricao = " + descricao + ", preco = " + preco);
		}
		
		connection.close();		
	}

}
