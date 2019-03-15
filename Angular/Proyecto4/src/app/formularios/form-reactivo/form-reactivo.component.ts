import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl,Validators, FormArray, FormBuilder} from '@angular/forms';

@Component({
  selector: 'app-form-reactivo',
  templateUrl: './form-reactivo.component.html',
  styleUrls: ['./form-reactivo.component.css']
})
export class FormReactivoComponent implements OnInit {

  miForm: FormGroup;
  nombres = ["arya","rickon","bran","sansa","robb"];

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit() {
    // this.miForm = new FormGroup({
    //   // usuario: new FormControl("Alejandro",[Validators.required,this.esStark]),
    //   usuario: new FormControl("Alejandro",[Validators.required,this.esStark(this.nombres)]),
    //   password: new FormControl("",[Validators.required,Validators.minLength(5)]),
    //   email: new FormControl("",Validators.required),
    //   skills: new FormArray([new FormControl("skill1"), new FormControl("skill2")])
    // });
    this.miForm = this.formBuilder.group({
      // usuario: new FormControl("Alejandro",[Validators.required,this.esStark]),
      usuario: this.formBuilder.control("Alejandro",[Validators.required,this.esStark(this.nombres)]),
      password: this.formBuilder.control("",[Validators.required,Validators.minLength(5)]),
      email: this.formBuilder.control("",Validators.required),
      skills: this.formBuilder.array([this.formBuilder.control("skill1"), this.formBuilder.control("skill2")])
    });
  }

  sendDatos(){
    console.log(this.miForm);
  }

  addSkill(newSkill:string){
    (<FormArray>this.miForm.controls.skills).push(this.formBuilder.control(newSkill));
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
