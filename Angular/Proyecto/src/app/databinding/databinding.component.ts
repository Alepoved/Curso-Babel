import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-databinding',
  templateUrl: './databinding.component.html',
  styleUrls: ['./databinding.component.css']
})
export class DatabindingComponent implements OnInit {

  nombre: string = "Alejandro";
  modoEditar = true;

  personaje = {
    nombre: "Homer",
    apellido: "Simpson"
  }
  constructor() { }

  ngOnInit() {
  }

  cambiarModoEditar(){
    this.modoEditar = !this.modoEditar;
  }

  cambiarNombre(nombre:any){
    // console.dir(nombre);
    this.personaje.nombre = nombre;
  }

}
