package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import modelo.entidades.Mensaje;


public class ScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext context;
	
    //Se inicia una sola vez cuando se crea el servlet
    //recordar que los servlets son sigleton
	@Override
	public void init() throws ServletException {
		context = WebApplicationContextUtils
					.getRequiredWebApplicationContext
					(getServletContext());
	}

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getSession().setAttribute("nombre", request.getParameter("nombre"));
		Mensaje msg = context.getBean("singleton",Mensaje.class);
		Mensaje msgPrototype1 = context.getBean("prototype",Mensaje.class);
		Mensaje msgPrototype2 = context.getBean("prototype",Mensaje.class);
		Mensaje msgRequest1 = context.getBean("request",Mensaje.class);
		Mensaje msgRequest2 = context.getBean("request",Mensaje.class);
		Mensaje msgSession = context.getBean("session",Mensaje.class);
		
		request.setAttribute("msgSingleton", msg);
		request.setAttribute("msgPrototype1", msgPrototype1);
		request.setAttribute("msgPrototype2", msgPrototype2);
		request.setAttribute("msgRequest1", msgRequest1);
		request.setAttribute("msgRequest2", msgRequest2);
		request.setAttribute("msgSession", msgSession);
		
		request.getRequestDispatcher("principal.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
