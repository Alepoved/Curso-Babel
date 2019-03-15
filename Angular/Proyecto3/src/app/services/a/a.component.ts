import { Component, OnInit } from '@angular/core';
import { DatosService } from '../datos.service';

@Component({
  selector: 'app-a',
  templateUrl: './a.component.html',
  styleUrls: ['./a.component.css'],
  // providers: [DatosService]
})
export class AComponent implements OnInit {

  datos=[];

  constructor(private datosService: DatosService) { }

  ngOnInit() {
    this.datos = this.datosService.getDatos();
  }

  addDato(newDato: HTMLInputElement){
    this.datosService.saveDatos(newDato.value);
    newDato.value="";
  }

  sendDato(newDato: HTMLInputElement){
    this.datosService.sendDatos(newDato.value);
    newDato.value="";
  }

}
