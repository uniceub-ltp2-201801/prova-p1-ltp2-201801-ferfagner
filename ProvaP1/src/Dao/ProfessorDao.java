package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import Model.Professor;



public class ProfessorDao {
	
	private Connection conexao;
	
	public ProfessorDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	public ArrayList<Professor> getProfessor() {
		
		try {
		ArrayList<Professor> profes = new ArrayList<Professor>();
		
		PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM professor");
		ResultSet rs = stmt.executeQuery();
		
					
			
			while(rs.next()) {
			
			Professor p = new Professor(rs.getInt("idProfessor"), 
					rs.getString("Nome"), rs.getDate("DataNasc"), rs.getString("NomeMae"), rs.getInt("Titulacao"));
			
			profes.add(p);
			}
			rs.close();
			stmt.close();
			return profes;
			
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
		
	}

	
}
