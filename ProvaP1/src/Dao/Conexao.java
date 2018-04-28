package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {

		public static Connection getConexao() {
	
			// Criando objeto conexao
			Connection conexao = null;
			
			// conectar no banco de dados
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://localhost/faculdade";
				String user = "root";
				String password = "root";

				// realizar conexão
				conexao = DriverManager.getConnection(url, user, password);

				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return conexao;
		}
		
}
