import { Injectable } from '@angular/core';
import { EventEmitter } from 'protractor';

@Injectable({
  providedIn: 'root'
})
export class DatosService {

  arrayTareas = [];
  datoEmitter = new EventEmitter();
  constructor() { }

  getTareas(){
    return this.arrayTareas;
  }
  sendDatos(newTarea: string){
    this.datoEmitter.emit(newTarea);
  }
}
