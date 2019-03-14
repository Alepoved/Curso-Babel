import { Injectable } from '@angular/core';

// @Injectable({
//   providedIn: 'root'
// })
export class DatosService {
  datos = ["dato1"];
  constructor() { }

  getDatos(){
    return this.datos;
  }

  saveDatos(newDato: string){
    this.datos.push(newDato);
  }
}
