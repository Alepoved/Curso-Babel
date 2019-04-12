package es.babel.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import es.babel.modelo.entidades.Historia;
import es.babel.modelo.gestor.GestorHistoria;

@RestController()
public class ControladorHistoria {

	@Autowired
	private GestorHistoria gh;
	
	@GetMapping(path="historia",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Historia> obtenerHistoria(){
		Historia h1 = gh.getHistoria();
		return new ResponseEntity<>(h1,HttpStatus.OK);
	}
	
	/*@PutMapping(path="historia")
	public ResponseEntity<Historia> escribirHistoria(@RequestBody Historia historia){
		return new ResponseEntity<Historia>(historia,HttpStatus.OK);		
	}*/
}
