package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.ClientesDAO;
import daosImpl.ClientesDAOImpl;
import modelo.Cliente;


@WebServlet("/ServletIdentificacionAdmin")
public class ServletIdentificacionAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("campoUsuario");
		String contraseña = request.getParameter("campoContraseña");
		ClientesDAO  clientesDAO = new ClientesDAOImpl();
		if(clientesDAO.identificarAdmin(usuario, contraseña)) {
			
			
			request.getSession().setAttribute("identificado", "ok");
			request.getRequestDispatcher("registroRopa.jsp").forward(request, response);
			
			
		}else {
			request.setAttribute("mensaje", "email y/o pass incorrectos");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		
		}
		
			
			
		
		
	}//end service

}//end class
