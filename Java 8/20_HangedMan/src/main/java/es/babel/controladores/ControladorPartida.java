package es.babel.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.babel.modelo.entidades.Partida;
import es.babel.modelo.gestor.GestorPartida;


@RestController()
public class ControladorPartida {

	@Autowired
	private GestorPartida gp;
	
	//create
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping(path="{categoria}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Partida> operar(@PathVariable("categoria") String categoria,@RequestParam("palabra") String palabra){
		
		Partida p = new Partida(palabra,categoria);
		try {
			gp.create(p);
			return new ResponseEntity<>(p,HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Partida>(p,HttpStatus.BAD_REQUEST);
		}
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping(path="buscar/{categoria}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List> operar(@PathVariable("categoria") String categoria){
		
		List<Partida> listaPalabras = gp.readByCategoria(categoria);
	
		
		return new ResponseEntity<List>(listaPalabras,HttpStatus.OK);
		
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping(path="categorias",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List> operar1(){
		
		List<String> listaCategorias = gp.readAllCategorias();
		
		return new ResponseEntity<List>(listaCategorias,HttpStatus.OK);
		
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(path="juego/intento",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> operar(@RequestBody Partida partida){
		System.out.println(partida);
		Partida p = gp.intento(partida);
		return new ResponseEntity<Integer>(p.getVidas(),HttpStatus.OK);
		
	}
	
}
