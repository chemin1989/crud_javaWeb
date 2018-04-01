package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.ClientesDAO;
import daosImpl.ClientesDAOImpl;
import modelo.Cliente;


@WebServlet("/ServletBorrarClientes")
public class ServletBorrarClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		ClientesDAO clienteDAO = new ClientesDAOImpl();
		Cliente borrar = clienteDAO.borrarClienteId(id);
		request.getRequestDispatcher("ServletListadoClientes").forward(request, response);
		
	}

}
