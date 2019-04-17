import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs'


@Injectable({
  providedIn: 'root'
})
export class MiServicioService {

  constructor(private httpClient:HttpClient) { }

  url = "http://localhost:8080/";

  public insertar(calculadora):Observable<any>{ 
    console.log("OP1:"+calculadora.op1);
    console.log("OP:"+calculadora.op);
    console.log("OP2:"+calculadora.op2);
    var url2 = calculadora.op+"?op1="+calculadora.op1+"&op2="+calculadora.op2;
    return this.httpClient.get(this.url+url2);
  }
}
