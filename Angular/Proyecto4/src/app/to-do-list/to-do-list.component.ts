import { Component, OnInit } from '@angular/core';
import { DataServiceService } from './data-service.service';

@Component({
  selector: 'app-to-do-list',
  templateUrl: './to-do-list.component.html',
  styleUrls: ['./to-do-list.component.css']
})
export class ToDoListComponent implements OnInit {

  arrayTareas = [];
  tarea;

  constructor(private datosService:DataServiceService) { }

  ngOnInit() {
    
  }

}
