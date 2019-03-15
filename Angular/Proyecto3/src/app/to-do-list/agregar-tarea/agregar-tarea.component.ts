import { Component, OnInit } from '@angular/core';
import { DatosService } from '../datos.service';

@Component({
  selector: 'app-agregar-tarea',
  templateUrl: './agregar-tarea.component.html',
  styleUrls: ['./agregar-tarea.component.css']
})
export class AgregarTareaComponent implements OnInit {

  arrayTareas=[];
  constructor(private dataService: DatosService) { }

  
  ngOnInit() {
    this.arrayTareas=this.dataService.getTareas();
  }

  agregarTarea(newTarea: HTMLInputElement){
    this.dataService.sendDatos(newTarea.value);
    newTarea.value = "";
  }

}
