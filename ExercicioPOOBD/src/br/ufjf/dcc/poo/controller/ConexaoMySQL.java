package br.ufjf.dcc.poo.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class ConexaoMySQL {

	private static String status = "Não conectado...";

	public static Connection criarConexao()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		Connection connection = null;
		String serverName = "aaronlab.dev"; // caminho do servidor do BD
		String mydatabase = "teste"; // nome do seu banco de dados
		String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
		String username = "root"; // nome de um usuário de seu BD
		String password = "senhaOO123"; // sua senha de acesso
		connection = DriverManager.getConnection(url, username, password);
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Testa a conexão com o banco
		if (connection != null) {
			status = ("STATUS: Conectado com sucesso!");
		} else {
			status = ("STATUS: Não foi possivel realizar conexão");
		}

		return connection;
	}

	public static ResultSet executarSelect(Connection conn, String sql) throws SQLException {
		// create the java statement
		Statement st = (Statement) conn.createStatement();
		
		//execute the query, and get a java resultset
		ResultSet rs = ((java.sql.Statement)st).executeQuery(sql);
		
		return rs;
	}

	public static int operacaoBanco(Connection conn, String sql) throws SQLException {
		try {
			PreparedStatement preparedStatement;
			preparedStatement = conn.prepareStatement(sql);
			preparedStatement.execute();
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public static String closeConection() {
		return status;
	}
	
	public static String statusConection() {
		return status;
	}

}