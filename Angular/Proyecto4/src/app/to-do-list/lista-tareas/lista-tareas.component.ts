import { Component, OnInit } from '@angular/core';
import { DataServiceService } from '../data-service.service';
import { Tarea } from '../tarea';

@Component({
  selector: 'app-lista-tareas',
  templateUrl: './lista-tareas.component.html',
  styleUrls: ['./lista-tareas.component.css']
})
export class ListaTareasComponent implements OnInit {


  constructor(private datosService: DataServiceService) { }

  ngOnInit() {
    this.lista = this.datosService.getListaTareas();
  }

  lista: Array<Tarea> = [];

  deleteTarea(tarea: Tarea){
    this.datosService.deleteTarea(tarea);
  }

  changeTarea(tarea: Tarea){
    this.datosService.changeTarea(tarea);
  }


}
