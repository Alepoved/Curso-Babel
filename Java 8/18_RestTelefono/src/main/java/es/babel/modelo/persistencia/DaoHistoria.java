package es.babel.modelo.persistencia;


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



import es.babel.modelo.entidades.Historia;

@Component

public class DaoHistoria {

	public Historia getHistoria() {
		RestTemplate restTemplate = new RestTemplate();
        Historia historia = restTemplate.getForObject("http://172.10.4.208:8080/historia", Historia.class);
        //Historia h = new Historia("alex","mi mensaje");
        return historia;
	}
	/*public boolean setHistoria(Historia h) {
		RestTemplate restTemplate = new RestTemplate();
        Historia historia = restTemplate.getForObject("http://172.10.4.208:8080/historia", Historia.class);
		return false;
	}*/
}
