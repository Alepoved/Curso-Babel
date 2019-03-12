import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directivas',
  templateUrl: './directivas.component.html',
  styleUrls: ['./directivas.component.css']
})
export class DirectivasComponent implements OnInit {

  mostrar = false;
  items = ["item1","item2","item3"];
  persona = {
    nombre: "Peter",
    apellido : "Parker"
  };
  mascota = "dinosaurio";
  constructor() { }

  ngOnInit() {
  }

  cambiarMostar(){
    this.mostrar = !this.mostrar;
  }

}
