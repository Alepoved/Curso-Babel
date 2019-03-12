import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  texto = "Winter is coming!!";
  precio = 12;
  fecha = new Date(2019,3,15);
  starks = ["Arya","Bran","Rickon","Sansa","Robb"];
  mensaje = new Promise<string>((resolve,reject)=>{
    setTimeout(()=>{
      resolve("Un mensaje secreto :)");
    },2000)
  })
  constructor() { }

  ngOnInit() {
  }

}
