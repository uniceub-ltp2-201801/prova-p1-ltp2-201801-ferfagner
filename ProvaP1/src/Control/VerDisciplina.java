package Control;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Conexao;
import Dao.DisciplinaDao;
import Dao.ProfessorDao;
import Model.Disciplina;
import Model.Professor;

/**
 * Servlet implementation class VerDisciplina
 */
@WebServlet("/VerDisciplina")
public class VerDisciplina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerDisciplina() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idprofessor = Integer.parseInt(request.getParameter("idprofessor"));
		
		Connection conexao = Conexao.getConexao();
		
			DisciplinaDao ds = new DisciplinaDao(conexao);
			
			ArrayList<Disciplina> d = ds.getDiscliplina(idprofessor);
			
			ProfessorDao prf = new ProfessorDao(conexao);
		
		ArrayList<Professor> prof = prf.getProfessor();
		
			
			request.setAttribute("professor", prof);
			request.setAttribute("disciplina", d);
			request.getRequestDispatcher( "ListarProfessores.jsp" ).forward( request, response );
		
		
		
		
		
		
	}

}
