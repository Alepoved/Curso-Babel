import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';


@Component({
  selector: 'app-hijo1',
  templateUrl: './hijo1.component.html',
  styleUrls: ['./hijo1.component.css']
})
export class Hijo1Component implements OnInit {

  nombre = "Nombre hijo 1";
  @Input() nombrePadre = "";
  @Output() nombreCambiado = new EventEmitter<string>();

  constructor() { }

  ngOnInit() {
  }

  cambiarNombre(nuevoNombre: string){
    this.nombre = nuevoNombre;
    this.nombreCambiado.emit(this.nombre);
  }

}
