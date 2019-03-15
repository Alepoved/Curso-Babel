import { Injectable, EventEmitter } from '@angular/core';
import { Tarea } from './tarea';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  // arrayTareas = [];
  // // datoEmitter = new EventEmitter();
  // constructor() { }

  // getTareas(){
  //   return this.arrayTareas;
  // }
  
  // saveDatos(newTarea:any){
  //   let tarea = {
  //     nombre: newTarea,
  //     completa: false
  //   }
  //   this.arrayTareas.push(tarea);
  //   console.log(tarea);
  // }

  lista: Array<Tarea> = [new Tarea(0,"tarea 1",false)];
  contId = 1;

  //no necesario

  

  constructor() {}

  getListaTareas(){return this.lista;}

  addTarea(nombre:string){
   const newTarea=new Tarea(this.contId,nombre,false);
    this.lista.push(newTarea);
    this.contId++;
    // this.lista = this.lista.concat([newTarea]);
  }

  deleteTarea(tarea: Tarea){
    let pos = this.lista.indexOf(tarea);
    this.lista.splice(pos,1);
    // this.lista = this.lista.filter(elem =>{
    //   return elem.id != tarea.id;
    // })
  }
  changeTarea(tarea: Tarea){
    tarea.completa = !tarea.completa;
  }
  
}
