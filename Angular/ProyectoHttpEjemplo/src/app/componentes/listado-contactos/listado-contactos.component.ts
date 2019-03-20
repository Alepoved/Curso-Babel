import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/entidades/app.entidades.persona';
import { PersonasService } from 'src/app/servicios/personas.service';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs'

@Component({
  selector: 'app-listado-contactos',                 
  templateUrl: './listado-contactos.component.html', 
  styleUrls: ['./listado-contactos.component.css'],  
})
export class ListadoContactosComponent implements OnInit {

  public personas:any 

  constructor(private personasService:PersonasService,
              private httpClient:HttpClient) { 
    this.actualizarPersonas()
  }

  ngOnInit() {
  }

  public actualizarPersonas(){
    
    /*
    let that:any = this
    let observable = this.httpClient.get('http://localhost:7000/personas')
    observable.subscribe(
      //success
      function(data) { 
        that.personas = data
        console.log(data)
      },
      function(err) {
        console.log(err)
      },
      function() {
        console.log("FIN")
      })
      
      /*
      observable.subscribe(
      //success
      data => { 
        this.personas = data
        console.log(data)
      },
      err => console.log(err)
      )
      */

    
     /*
    let that = this
    let observable = this.personasService.listar()
    observable.subscribe(
      function(data) { 
        that.personas = data
        console.log(data)
      },
      function(err) {
        console.log(err)
      })*/
      
    let observable = this.personasService.listar()
      observable.subscribe(
        data => this.personas = data,
      err => console.log(err)
    )  
      
  }

}






