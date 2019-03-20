import { Injectable } from '@angular/core';
import { Persona } from '../entidades/app.entidades.persona';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs'
import { ConfiguracionService} from './configuracion.service'

//PROXY
@Injectable({
  providedIn: 'root'
})
export class PersonasService {

  constructor(private httpClient:HttpClient) {
    console.log("CREANDO PERSONAS_SERVICE")
  }

  public insertar(persona:Persona):Observable<any>{  
    return this.httpClient.post(ConfiguracionService.url+"/personas", 
                                persona)
  }
  
  public listar():Observable<any>{
    return this.httpClient.get(ConfiguracionService.url+"/personas")
  }  

  public buscar(id:number):Observable<any>{
    return this.httpClient.get(ConfiguracionService.url+"/personas/"+id)
  }

}


