import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LogService {

  constructor() { }

  mostrarMsg(msg){
    console.log("Mensaje: "+msg);
  }
}
