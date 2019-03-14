import { Component, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-cv',
  templateUrl: './cv.component.html',
  styleUrls: ['./cv.component.css']
})
export class CVComponent implements OnInit {

  @Output() nombre = new EventEmitter<string>();
  @Output() apellido = new EventEmitter<string>();
  @Output() email = new EventEmitter<string>();
  @Output() fechaN = new EventEmitter<Date>();
  @Output() skills = new EventEmitter<Array<string>>();
  @Output() imagen = new EventEmitter();

  arraySkills = [];

  constructor() { }

  ngOnInit() {
  }

  cambiarNombre(nuevoNombre: string){
    this.nombre.emit(nuevoNombre);
  }
  cambiarApellido(nuevoApellido: string){
    this.apellido.emit(nuevoApellido);
  }
  cambiarEmail(nuevoEmail: string){
    this.email.emit(nuevoEmail);
  }
  cambiarFechaN(nuevaFecha: Date){
    this.fechaN.emit(nuevaFecha);
  }
  cambiarImagen(nuevaImagen: File){
    this.imagen.emit(nuevaImagen);
  }
  cambiarSkills(nuevaSkills:any){

    this.arraySkills.push(nuevaSkills.value);
    nuevaSkills.value="";
    console.log(this.arraySkills);
    this.skills.emit(this.arraySkills);
    document.getElementsByName("skills");
  
  }
}
