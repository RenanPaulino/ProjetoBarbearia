package br.com.barbearia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoJdbcDao {
	
	private static String endereco = "jdbc:mysql://localhost/usuario?useTimezone=true&serverTimezone=UTC";
	private static String user = "root";
	private static String password = "123";
	
	public Connection conectaBD() {
		Connection conn = null;
			
		try {
			conn = DriverManager.getConnection(endereco, user, password);

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro conexão com o banco de dados" + e.getMessage());
		}
		return conn;
	}
}
