import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
// import { CmpCanDeactivate } from './editar.guard';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-editar',
  templateUrl: './editar.component.html',
  styleUrls: ['./editar.component.css']
})
export class EditarComponent implements OnInit/*,CmpCanDeactivate*/ {
  
 
  datosGuardados = false;
  id = "";
  constructor(private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    this.activatedRoute.paramMap.subscribe(params => {
     if(params.has("id")){
        this.id=params.get("id");
      }
    })
  }

  guardar(){
    this.datosGuardados = !this.datosGuardados;
  }
  canDeactivate():  Observable<boolean> | Promise<boolean> | boolean{
    if(this.datosGuardados){
      return true;
    }
    else{
      return confirm("quieres salir del cmp?");
    }
  }

  
}
