package controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;


import entidades.Usuario;
import gestores.GestorLogin;

@Controller
@RequestScope
public class ControladorLogin {
	
	@RequestMapping(path="formularioLogin",method=RequestMethod.GET)
	//@RequestMapping("verFormularioSaludo")
	//@GetMapping -> por defecto son todas get
	public String verFormulario(HttpSession session) {
		session.invalidate();
		System.out.println("Sesion finalizada");
		return "formularioLogin";
	}

	@RequestMapping(path="loginUsuario",method=RequestMethod.POST)
	public ModelAndView alta(HttpSession session,HttpServletRequest request, @RequestParam("nombre") String nombre,@RequestParam("password") String password) {
		
		//String nombreRequest = request.getParameter("nombre");
		System.out.println(nombre+" "+password);
		String path="";
		GestorLogin gl = new GestorLogin();
		Usuario u = new Usuario(nombre,password);
		if(!gl.login(u))
			path="formularioLogin";
		else path="pedirPizza";
		
		session.setAttribute("nombre", nombre);
		ModelAndView mav = new ModelAndView("redirect:"+path);
		
		return mav;
	}
}
