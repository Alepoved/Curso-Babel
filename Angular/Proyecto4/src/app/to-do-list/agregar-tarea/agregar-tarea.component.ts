import { Component, OnInit } from '@angular/core';
import { DataServiceService } from '../data-service.service';
import {FormGroup,FormControl,Validators, FormArray, FormBuilder} from '@angular/forms';

@Component({
  selector: 'app-agregar-tarea',
  templateUrl: './agregar-tarea.component.html',
  styleUrls: ['./agregar-tarea.component.css']
})
export class AgregarTareaComponent implements OnInit {

  arrayTareas=[];
  miForm: FormGroup;

  constructor(private dataService: DataServiceService,private formBuilder: FormBuilder) { }

  
  ngOnInit() {
    
  }

  private initForm(){
    this.miForm = this.formBuilder.group({
      nombre: this.formBuilder.control("",Validators.required),
      completa: this.formBuilder.control(false,Validators.required)
    })
  }

  addTarea(newTarea: HTMLInputElement){
    this.dataService.addTarea(newTarea.value);
    newTarea.value= "";
  }

  sendTarea(){
    console.log(this.miForm);
    const nombre = this.miForm.value.nombre;
    this.dataService.addTarea(nombre);
    this.initForm();
  }


}
