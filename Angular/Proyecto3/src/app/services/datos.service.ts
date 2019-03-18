import { Injectable,EventEmitter } from '@angular/core';
import { LogService } from './log.service';

@Injectable({
  providedIn: 'root'
})
export class DatosService {
  
  datos = ["dato1"];
  datoEmitter = new EventEmitter<string>();

  constructor(private logService: LogService) { }

  getDatos(){
    return this.datos;
  }

  saveDatos(newDato: string){
    this.datos.push(newDato);
    this.logService.mostrarMsg("Se ha añadido "+newDato);
  }

  sendDatos(newDato: string) {
    this.datoEmitter.emit(newDato);
  }
}
