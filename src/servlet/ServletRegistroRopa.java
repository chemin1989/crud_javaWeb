package servlet;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMessages;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import daos.RopaDAO;
import daosImpl.RopaDAOImpl;
import jdk.nashorn.internal.scripts.JO;
import modelo.Ropa;

@WebServlet("/ServletRegistroRopa")
public class ServletRegistroRopa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getSession().getAttribute("identificado") == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}

		System.out.println("ejecucion servlet registroRopa");

		String marca = request.getParameter("campoMarca");
		String modelo = request.getParameter("campoModelo");
		String pais = request.getParameter("campoPais");
		String coste = request.getParameter("campoCoste");
		String talla = request.getParameter("campoTalla");
		String color = request.getParameter("campoColor");
		String descripcion = request.getParameter("campoDescripcion");
		Part imagenSubida = request.getPart("campoImagen");

		// Validaciones
//		String gxmarca = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄—Ò\\s0-9]{3,10}";
//		String gxmodelo = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄—Ò\\s0-9]{3,10}";
//		String gxpais = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄—Ò\\s]{3,15}";
//		String gxcoste = "[0-9]{1,4}[,]?[.]?[0-9]{0,2}";
//		String gxtalla = "[xsml1-9]{1,3}";
//		String gxcolor = "#?[a-zA-Z·ÈÌÛ˙¡…Õ”⁄—Ò\\s0-9]{2,15}";
//		String gxdescripcion = "[a-zA-Z·ÈÌÛ˙¡…Õ”⁄—Ò\\s0-9]{0,100}";
//
//		Pattern p = Pattern.compile(gxmarca);
//		Matcher m = p.matcher(marca);
//
//		Pattern p1 = Pattern.compile(gxmodelo);
//		Matcher m1 = p1.matcher(modelo);
//
//		Pattern p2 = Pattern.compile(gxpais);
//		Matcher m2 = p2.matcher(pais);
//
//		Pattern p3 = Pattern.compile(gxcoste);
//		Matcher m3 = p3.matcher(coste);
//
//		Pattern p4 = Pattern.compile(gxtalla);
//		Matcher m4 = p4.matcher(talla.toLowerCase());
//
//		Pattern p5 = Pattern.compile(gxcolor);
//		Matcher m5 = p5.matcher(color);
//
//		Pattern p6 = Pattern.compile(gxdescripcion);
//		Matcher m6 = p6.matcher(descripcion);
//
//		if (m.matches()&& m1.matches()&&m2.matches()&& m3.matches()&& m4.matches()&& m5.matches()&& m6.matches()) {
//			System.out.println("datos introducidos correctamente");	
//			
//			
//			  
//		} else {
//			request.setAttribute("info", "Algun dato no valido");
//			request.getRequestDispatcher("registroRopa.jsp").forward(request, response);
				
//		}
		System.out.println("hola");
		Ropa registroRopa = new Ropa(marca, modelo, pais, coste, talla, color, descripcion, imagenSubida);

		System.out.println("que hay en ropa: " + registroRopa.toString());
		RopaDAO ropaDAO = new RopaDAOImpl();
		ropaDAO.registrarRopa(registroRopa);
		request.getRequestDispatcher("registroRopa.jsp").forward(request, response);
		

	}

}