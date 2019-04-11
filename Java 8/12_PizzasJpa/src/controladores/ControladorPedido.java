package controladores;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

import entidades.Pedido;
import entidades.Pizza;
import entidades.Usuario;
import gestores.GestorLogin;
import gestores.GestorPedido;

@Controller
@RequestScope
public class ControladorPedido {
	
	@RequestMapping(path="pedirPizza",method=RequestMethod.GET)
	public String pedirPizza() {
		return "pedirPizza";
	}
	
	@RequestMapping(path="resumenPedido",method=RequestMethod.GET)
	public String mostrarResumen() {
		return "resumenPedido";
	}
	
	
	@RequestMapping(path="realizarPedido",method=RequestMethod.POST)
	public ModelAndView pedir(HttpSession session,HttpServletRequest request, @RequestParam("direccion") String direccion,
			@RequestParam("tamaño") String tamaño,@RequestParam(value="ingredientes",required=false) List<String> ingredientes) {
		
		System.out.println(direccion+" "+tamaño+" ");
		if(ingredientes!=null) {
			for (String ing : ingredientes) {
				System.out.println(ing);
			}
		}
		else ingredientes = new ArrayList<>();
		String path="";
		String nombre = (String) session.getAttribute("nombre");
		GestorPedido gp = new GestorPedido();
		Pizza p = new Pizza(ingredientes,tamaño);
		Pedido pe = new Pedido(p,nombre,direccion);
		if(!gp.pedir(pe))
			path="pedirPizza";
		else path="resumenPedido";
		
		//ModelAndView mav = new ModelAndView(path);
		ModelAndView mav = new ModelAndView("redirect:"+path);
		
		double precio = gp.calculaPrecio(p);
		/*mav.addObject("direccion",direccion);
		mav.addObject("tamaño",tamaño);
		mav.addObject("ingredientes",ingredientes);
		mav.addObject("precio",precio);*/
		session.setAttribute("direccion", direccion);
		session.setAttribute("tamaño",tamaño);
		session.setAttribute("ingredientes",ingredientes);
		session.setAttribute("precio",precio);
		return mav;
	}
	
	
}
