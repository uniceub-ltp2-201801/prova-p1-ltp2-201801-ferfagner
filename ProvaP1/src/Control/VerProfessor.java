package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Conexao;
import Dao.ProfessorDao;
import Model.Professor;

/**
 * Servlet implementation class VerProfessor
 */
@WebServlet("/VerProfessor")
public class VerProfessor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerProfessor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conexao = Conexao.getConexao();
		
		ProfessorDao prf = new ProfessorDao(conexao);
		
		ArrayList<Professor> prof = prf.getProfessor();
		//for (int i = 0; i < prof.size(); i++) {
			
			request.setAttribute("professor", prof);
			RequestDispatcher rd = request.getRequestDispatcher("exibirProfessor.jsp");
			
			rd.forward(request, response);
			 
				
		//}
		
		
	}

}
