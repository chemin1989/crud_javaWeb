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
import modelo.Cliente;


@WebServlet("/ServletEditarClientes")
public class ServletEditarClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		ClientesDAO clienteDAO = new ClientesDAOImpl();
		Cliente editar = clienteDAO.obtenerCLientePorId(id);
		request.setAttribute("editar", editar);
		request.getRequestDispatcher("editarCliente.jsp").forward(request, response);
		
	}

}
