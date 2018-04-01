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
import modelo.Cliente;


@WebServlet("/ServletGuardarCambiosClientes")
public class ServletGuardarCambiosClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String nombre = request.getParameter("campoNombre");
			String apellidos = request.getParameter("campoApellidos");
			String direccion = request.getParameter("campoDireccion");
			String numero = request.getParameter("campoNumero");
			String poblacion = request.getParameter("campoPoblacion");
			String cp = request.getParameter("campoCp");
			String email = request.getParameter("campoEmail");
			String ep =request.getParameter("campoEP");
			String id = request.getParameter("campoId");
		
			
			
			//validar
			//....
			//fin validar
			
			Cliente cliente = new Cliente(nombre, apellidos, direccion, numero, poblacion, cp, email, ep);
			
			cliente.setId(Integer.parseInt(id));
			ClientesDAO clienteDAO = new ClientesDAOImpl();
			clienteDAO.guardarCamiosCliente(cliente);
			request.getRequestDispatcher("ServletListadoClientes").forward(request, response);
					
	}

}
