import { Component, OnInit } from '@angular/core';
import { DatosService } from '../datos.service';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent implements OnInit {

  arrayTareas = [];
  tarea = "";

  constructor(private datosService:DatosService) { }

  ngOnInit() {
    // this.tarea = this.datosService.getDatos();
    // this.datosService.datoEmitter.subscribe(dato => {
    //   this.tarea = dato;
    // });
  }

}
