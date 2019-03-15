import { Component, OnInit } from '@angular/core';
import { DatosService } from '../datos.service';

@Component({
  selector: 'app-b',
  templateUrl: './b.component.html',
  styleUrls: ['./b.component.css'],
  // providers: [DatosService]
})
export class BComponent implements OnInit {

  datos=[];
  datoRecibido = "";
  constructor(private datosService: DatosService) { }

  ngOnInit() {
    this.datos = this.datosService.getDatos();
    this.datosService.datoEmitter.subscribe(dato => {
      this.datoRecibido = dato;
    });
  }

  addDato(newDato: HTMLInputElement){
    this.datosService.saveDatos(newDato.value);
    newDato.value="";
  }

}
