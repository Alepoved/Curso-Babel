import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AhorcadoService {

  constructor(private httpClient: HttpClient) { }

  categoria: string;

  public getCategorias():Observable<any>{  
    return this.httpClient.get("http://172.10.4.186:8080/categorias");
  }

  public getPalabras(categoria:string):Observable<any>{
    return this.httpClient.get("http://172.10.4.186:8080/buscar/"+categoria);
  }
  
  public getIntentos(partida:Object):Observable<any>{
    return this.httpClient.post("http://172.10.4.186:8080/juego/intento", partida);
  }
}
