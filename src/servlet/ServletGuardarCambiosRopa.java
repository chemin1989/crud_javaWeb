package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.RopaDAO;
import daosImpl.RopaDAOImpl;
import modelo.Ropa;


@WebServlet("/ServletGuardarCambiosRopa")
public class ServletGuardarCambiosRopa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String marca = request.getParameter("campoMarca");
		String modelo = request.getParameter("campoModelo");
		String pais = request.getParameter("campoPais");
		String coste = request.getParameter("campoCoste");
		String talla = request.getParameter("campoTalla");
		String color = request.getParameter("campoColor");
		String descripcion = request.getParameter("campoDescripcion");
		String id = request.getParameter("campoId");
		//validar
		//...
		//validar
		Ropa ropa = new Ropa(marca, modelo, pais, coste, talla, color, descripcion);
			
			ropa.setId(Integer.parseInt(id));
		RopaDAO ropaDAO = new RopaDAOImpl();
		ropaDAO.guardarCambiosRopa(ropa);
		
		request.getRequestDispatcher("ServletListadoRopa").forward(request, response);
		
	}

}
