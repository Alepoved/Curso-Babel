import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { MiServicioService } from '../mi-servicio.service';

@Component({
  selector: 'app-calculadora',
  templateUrl: './calculadora.component.html',
  styleUrls: ['./calculadora.component.css']
})
export class CalculadoraComponent implements OnInit {

  constructor(private service:MiServicioService) { }

  ngOnInit() {
  }

  calculadora = {
    op1: "",
    op2: "",
    op: ""
  }

  enviarDatos(miForm: NgForm){
   this.calculadora.op1 = miForm.value.op1;
   this.calculadora.op2 = miForm.value.op2;
   this.calculadora.op = miForm.value.op;
   this.service.insertar(this.calculadora);
}

  

}
