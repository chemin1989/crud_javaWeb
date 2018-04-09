package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.UsuariosDAO;
import daosImpl.UsuariosDAOImpl;
import modelo.Usuario;


@WebServlet("/ServletRegistroUsuarios")
public class ServletRegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre = request.getParameter("campoNombre");
		String email = request.getParameter("campoEmail");
		String comentario = request.getParameter("campoComentario");
		
		Usuario registro = new Usuario(nombre, email, comentario);
		
		UsuariosDAO dao = new UsuariosDAOImpl();
		dao.registrarUsuario(registro);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}
