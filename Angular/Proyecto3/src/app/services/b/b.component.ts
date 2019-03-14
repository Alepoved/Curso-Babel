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
  constructor(private datosService: DatosService) { }

  ngOnInit() {
    this.datos = this.datosService.getDatos();
  }

  addDato(newDato: HTMLInputElement){
    this.datosService.saveDatos(newDato.value);
    newDato.value="";
  }

}
