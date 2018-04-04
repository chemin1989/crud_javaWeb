package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.ClientesDAO;
import daosImpl.ClientesDAOImpl;
import daosImpl.RopaDAOImpl;
import modelo.Cliente;

@WebServlet("/ServletRegistroClientes")
public class ServletRegistroClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getSession().getAttribute("identificado") == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;

		}

		System.out.println("Se ejecuta el Servlet Listado Clientes");

		String nombre = request.getParameter("campoNombre");
		String apellidos = request.getParameter("campoApellidos");
		String direccion = request.getParameter("campoCalle");
		String numero = request.getParameter("campoN");
		String poblacion = request.getParameter("campoPoblacion");
		String cp = request.getParameter("campoCp");
		String email = request.getParameter("campoEmail");
		String ep = request.getParameter("campoEP");

		// Validaciones
		String gxnombre = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄—Ò\\s]{3,20}";
		String gxapellidos = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄—Ò\\s]{3,30}";
		String gxdireccion = "[a-zA-Z/·ÈÌÛ˙¡…Õ”⁄—Ò\\s0-9]{3,30}";
		String gxnumero = "[0-9]{1,4}";
		String gxpoblacion = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄—Ò\\s]{3,20}";
		String gxcp = "[0-9]{3,6}";
		String gxemail = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
		String gxep = "empresa{0,1}|particular{0,1}";

		Pattern p = Pattern.compile(gxnombre);
		Matcher m = p.matcher(nombre);

		Pattern p1 = Pattern.compile(gxapellidos);
		Matcher m1 = p1.matcher(apellidos);

		Pattern p2 = Pattern.compile(gxdireccion);
		Matcher m2 = p2.matcher(direccion);

		Pattern p3 = Pattern.compile(gxnumero);
		Matcher m3 = p3.matcher(numero);

		Pattern p4 = Pattern.compile(gxpoblacion);
		Matcher m4 = p4.matcher(poblacion);

		Pattern p5 = Pattern.compile(gxcp);
		Matcher m5 = p5.matcher(cp);

		Pattern p6 = Pattern.compile(gxemail);
		Matcher m6 = p6.matcher(email);

		Pattern p7 = Pattern.compile(gxep);
		Matcher m7 = p7.matcher(ep);

		if (m.matches() && m1.matches() && m2.matches() && m3.matches() && m4.matches() && m5.matches() && m6.matches()
				&& m7.matches()) {
			System.out.println("datos introducidos correctamente");
			
		} else {
			request.setAttribute("info", "Algun dato no valido");
			request.getRequestDispatcher("registrarClientes.jsp").forward(request, response);

		}

		Cliente registro = new Cliente(nombre, apellidos, direccion, numero, poblacion, cp, email, ep);
		ClientesDAO clientesDAO = new ClientesDAOImpl();
		clientesDAO.registrarCliente(registro);
		request.getRequestDispatcher("registrarClientes.jsp").forward(request, response);

	}

}
