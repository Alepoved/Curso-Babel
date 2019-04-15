package es.babel.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import es.babel.modelo.entidades.Calculadora;
import es.babel.modelo.gestor.GestorCalculadora;

@RestController()
public class ControladorCalculadora {

	@Autowired
	private GestorCalculadora gh;
	
	@GetMapping(path="{tipo}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Calculadora> operar(@PathVariable("tipo") String op,@RequestParam("op1") double op1,@RequestParam("op2") double op2){
		Calculadora c = new Calculadora(op1,op2,op); 
		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op);
	
		c.calcular();
		try {
			gh.create(c);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Calculadora>(c,HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(path="update",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Calculadora> operar(@RequestBody Calculadora c){
		
		c.calcular();
		gh.modificar(c);
		
		return new ResponseEntity<Calculadora>(c,HttpStatus.OK);	
	}
	
	@GetMapping(path="list",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List> operar(){
		
		
		List<Calculadora> l = gh.list();
		for (Calculadora c : l) {
			System.out.println(c);
		}
		
		return new ResponseEntity<List>(l,HttpStatus.OK);	
	}
	
	
	
	/*@PutMapping(path="historia")
	public ResponseEntity<Historia> escribirHistoria(@RequestBody Historia historia){
		return new ResponseEntity<Historia>(historia,HttpStatus.OK);		
	}*/
}
