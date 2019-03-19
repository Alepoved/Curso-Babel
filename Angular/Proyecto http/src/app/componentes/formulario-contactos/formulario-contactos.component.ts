import { Component, OnInit } from '@angular/core';
import { PersonasService } from 'src/app/servicios/personas.service';
import { Persona } from 'src/app/entidades/app.entidades.persona';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-formulario-contactos',
  templateUrl: './formulario-contactos.component.html',
  styleUrls: ['./formulario-contactos.component.css']
})
export class FormularioContactosComponent implements OnInit {

  public persona:Persona

  constructor(private personasService:PersonasService,
              private router:Router,
              private ruta:ActivatedRoute) {
    let id = ruta.snapshot.params['id']
    if(id){
      personasService.buscar(id)
        .subscribe(
          data => this.persona = data,
          err => console.log(err)
        )
    } 

    this.vaciarFormulario()

  }

  ngOnInit() {
  }
  
  public insertar():void{
    /*
    let that = this
    this.personasService.insertar(this.persona)
      .subscribe(
        function(data){
          //Nos da igual que despues de insertar nos devuelvan la persona con id
          //pero no navegaremos hasta que eso ocurra
          that.router.navigate(['listadoContactos'])
        },
        function(err){
          console.log(err)
        }) */
    this.personasService.insertar(this.persona)
      .subscribe(
        data => this.router.navigate(['listadoContactos']),
        err => console.log(err)
      )
  }

  public modificar():void{
    
  }
  
  public borrar():void{
    
  }
  public vaciarFormulario():void{
    this.persona = new Persona()
  }

}
