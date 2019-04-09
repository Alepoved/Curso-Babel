package controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

import entidades.Persona;
import entidades.Saludos;

@Controller
@RequestScope
public class ControladorSaludos {

	@Autowired
	private Saludos saludosSession;
	
	@RequestMapping(path="verFormularioSaludo",method=RequestMethod.GET)
	//@RequestMapping("verFormularioSaludo")
	//@GetMapping -> por defecto son todas get
	public String verFormulario() {
		return "formularioSaludos";//WEB-INF/vistas/formulariosSaludos.jsp
	}
	
	//metodos sobrecargados en spring
	//podemos inyectar muchos tipos de objs en el metodo
	@RequestMapping(path="altaSaludo",method=RequestMethod.POST)
	public ModelAndView alta(HttpSession session,HttpServletRequest request, @RequestParam("nombre") String nombre) {
		ModelAndView mav = new ModelAndView("redirect:verSaludos");
		//String nombreRequest = request.getParameter("nombre");
		System.out.println(nombre);
		session.setAttribute("atributoSession","Valor 1");
		//Saludos saludosSession = (Saludos)session.getAttribute("saludos");
		saludosSession.getLista().add(nombre);
		System.out.println(saludosSession.getLista());
		
		mav.addObject("nombre",nombre);
		return mav;
	}
	
	@GetMapping("verSaludos")
	public ModelAndView mostrarSaludos(@RequestParam("nombre") String nombre) {
		ModelAndView mav = new ModelAndView();
		Persona p = new Persona();
		p.setNombre(nombre);
		
		mav.addObject("persona",p);
		mav.addObject("listaSaludos",saludosSession.getLista());
		mav.addObject("saludo",nombre);
		return mav;
	}
}
