package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.RopaDAO;
import daosImpl.RopaDAOImpl;


@WebServlet("/ServletListadoRopa")
public class ServletListadoRopa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Atendemos a listado ropa");
		RopaDAO ropaDAO = new RopaDAOImpl();
		request.setAttribute("ropa", ropaDAO.obtenerRopa());
		request.getRequestDispatcher("listadoRopa.jsp").forward(request, response);
		
	
	
	}

}
