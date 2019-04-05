package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HolaMundoServlet
 */
public class HolaMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HolaMundoServlet() {
        super();
    }

	/*Cabeceras ->
	 * contentType -> tipo de recurso que estamos mandando
	 * accept -> (request) tipo de recurso que el cliente acepta
	 * 
	 * */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		String param1 = request.getParameter("nombre");
		response.setContentType("text/html");
		pw.println("<h1>Esto es una prueba "+param1+"</h1>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
