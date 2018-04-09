package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.ClientesDAO;
import daos.RopaDAO;
import daosImpl.ClientesDAOImpl;
import daosImpl.RopaDAOImpl;


@WebServlet("/ServletListadoClientes")
public class ServletListadoClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("ServletListadoRopa-hasta aqui");
		ClientesDAO clientesDAO = new ClientesDAOImpl();
		request.setAttribute("clientes", clientesDAO.listarCliente());
		request.getRequestDispatcher("ServletListadoClientes").forward(request, response);
		
		
		
		
	}

}
