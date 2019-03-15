import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl,Validators, FormArray} from '@angular/forms';

@Component({
  selector: 'app-form-reactivo',
  templateUrl: './form-reactivo.component.html',
  styleUrls: ['./form-reactivo.component.css']
})
export class FormReactivoComponent implements OnInit {

  miForm: FormGroup;
  nombres = ["arya","rickon","bran","sansa","robb"];
  constructor() { }

  ngOnInit() {
    this.miForm = new FormGroup({
      // usuario: new FormControl("Alejandro",[Validators.required,this.esStark]),
      usuario: new FormControl("Alejandro",[Validators.required,this.esStark(this.nombres)]),
      password: new FormControl("",[Validators.required,Validators.minLength(5)]),
      email: new FormControl("",Validators.required),
      skills: new FormArray([new FormControl("skill1"), new FormControl("skill2")])
    });
  }

  sendDatos(){
    console.log(this.miForm);
  }

  addSkill(newSkill:string){
    (<FormArray>this.miForm.controls.skills).push(new FormControl(newSkill));
  }

  esStark(nombres: Array<string>){
   return (formControl: FormControl) => {
    if(this.nombres.includes(formControl.value.toLowerCase())){
      return null;//valido
    }
    return {esStark: "El nombre no es un Stark"}
   };
    
  }
  // esStark(formControl: FormControl){
  //   const nombres = ["arya","rickon","bran","sansa","robb"];
  //   if(nombres.includes(formControl.value.toLowerCase())){
  //     return null;//valido
  //   }
  //   return {esStark: "El nombre no es un Stark"}
  // }

}
