import { Injectable } from '@angular/core';
import {Tarea} from "./tarea"

@Injectable({
  providedIn: 'root'
})
export class DataService {
  
  arrayTareas:Array<Tarea> = [];
  contId = 0;
  constructor() { }

  addTarea(value: string): any {
  
   this.arrayTareas.push(new Tarea(this.contId,value,false));
   this.contId++;
  }

  getTareas(){
    return this.arrayTareas;
  }
}
