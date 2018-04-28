package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Professor;

import Model.Disciplina;

public class DisciplinaDao {
	
private Connection conexao;
	
	public DisciplinaDao(Connection conexao) {
		this.conexao = conexao;
	}

	public ArrayList<Disciplina> getDiscliplina(int idprofessor) {
		
		ArrayList<Disciplina> resultado = new ArrayList<Disciplina>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			String query = "SELECT * FROM DISCIPLINA WHERE idprofessor=? ";
			ps = conexao.prepareStatement(query);
			ps.setInt(1, idprofessor);
			
			rs = ps.executeQuery();
			
			while(rs.first()) {
				Disciplina d = new Disciplina(rs.getInt("iddisciplina"), rs.getInt("idprofessor"), rs.getString("nome"), rs.getString("curso"), rs.getInt("cargahoraria"));
			}
			
			
			rs.close();
			ps.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	
	}
}