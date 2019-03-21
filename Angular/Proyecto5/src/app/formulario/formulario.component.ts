import { Component, OnInit } from '@angular/core';
import {NgForm} from "@angular/forms";
import { Router } from '@angular/router';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {

  data = {
    name: "",
    surname: "",
    username: "",
  }
  constructor(private route:Router) { }

  ngOnInit() {
  }

  submitForm(data: NgForm){
    console.log(data);
    this.route.navigate(["/usuario/1"]);
  }

}
