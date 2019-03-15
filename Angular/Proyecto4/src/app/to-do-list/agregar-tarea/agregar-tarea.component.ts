import { Component, OnInit } from '@angular/core';
import { DataServiceService } from '../data-service.service';

@Component({
  selector: 'app-agregar-tarea',
  templateUrl: './agregar-tarea.component.html',
  styleUrls: ['./agregar-tarea.component.css']
})
export class AgregarTareaComponent implements OnInit {

  arrayTareas=[];
  constructor(private dataService: DataServiceService) { }

  
  ngOnInit() {
  
  }

  addTarea(newTarea: HTMLInputElement){
    this.dataService.addTarea(newTarea.value);
    newTarea.value= "";
  }


}
