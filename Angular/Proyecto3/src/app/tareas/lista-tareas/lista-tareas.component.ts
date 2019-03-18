import { Component, OnInit } from '@angular/core';
import { DatosService } from 'src/app/services/datos.service';
import { Tarea } from '../tarea';
import { DataService } from '../data.service';

@Component({
  selector: 'app-lista-tareas',
  templateUrl: './lista-tareas.component.html',
  styleUrls: ['./lista-tareas.component.css']
})
export class ListaTareasComponent implements OnInit {

  arrayTareas: Array<Tarea> = [];
  constructor(private service:DataService) { }

  ngOnInit() {
    this.arrayTareas = this.service.getTareas();
  }

  tachar(item:Tarea){
    item.completa = !item.completa;
  }

  eliminar(item:Tarea){
    let pos = this.arrayTareas.indexOf(item);
    this.arrayTareas.splice(pos,1);
  }

}
