import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-cotenedor',
  templateUrl: './cotenedor.component.html',
  styleUrls: ['./cotenedor.component.css']
})
export class CotenedorComponent implements OnInit {

  nombre = "";
  apellido = "";
  fechaN = "";
  email = "";
  skills = [];
  imagen = "";
  constructor() { }

  ngOnInit() {
  }

 

}
