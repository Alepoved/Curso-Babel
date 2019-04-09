package controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
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

	@RequestMapping(path="realizarPedido",method=RequestMethod.POST)
	public ModelAndView pedir(HttpSession session,HttpServletRequest request, @RequestParam("direccion") String direccion,
			@RequestParam("tamaño") String tamaño,@RequestParam("ingredientes") List<String> ingredientes) {
		
		//String nombreRequest = request.getParameter("nombre");
		System.out.println(direccion+" "+tamaño+" ");
		
		for (String ing : ingredientes) {
			System.out.println(ing);
		}
		String path="";
		GestorPedido gp = new GestorPedido();
		Pizza p = new Pizza(ingredientes,tamaño);
		Pedido pe = new Pedido(p,"pepe",direccion);
		if(!gl.login(u))
			path="formularioLogin";
		else path="pedirPizza";
		
		ModelAndView mav = new ModelAndView(path);
		
		return mav;
	}
}
