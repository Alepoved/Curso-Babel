import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs'


@Injectable({
  providedIn: 'root'
})
export class MiServicioService {

  constructor() { }

  public insertar(calculadora)/*:Observable<any>*/{ 
    console.log("Insertar"+calculadora.op1);
   // return this.httpClient.post(ConfiguracionService.url+"/personas", persona);
  }
}
