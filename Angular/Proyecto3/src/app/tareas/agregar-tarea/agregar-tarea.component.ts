import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-agregar-tarea',
  templateUrl: './agregar-tarea.component.html',
  styleUrls: ['./agregar-tarea.component.css']
})
export class AgregarTareaComponent implements OnInit {

  constructor(private service:DataService) { }

  ngOnInit() {
  }

  addTarea(tarea: HTMLInputElement){
    this.service.addTarea(tarea.value);
    tarea.value="";
  }

}
