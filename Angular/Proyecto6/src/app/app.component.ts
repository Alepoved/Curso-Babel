import { Component, OnInit } from '@angular/core';
import { Student } from './student.model';
import { StudentService } from './student.service';
import { HttpClient } from 'selenium-webdriver/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  
 
  students: Student[] = [];

  constructor(private service:StudentService, private httpClient:HttpClient) {}

  ngOnInit(){
    const studentsObs = this.service.getStudents();
    studentsObs.subscribe((elem: Student[]) => {
      this.students = elem;
    })
  }

  actualizarPersonas(){
    // let that:any = this;//referencia al componente, no al objeto
    // let observable = this.httpClient.get("http://url");
    // observable.subscribe(
    //   // function(data){
    //   //   that.students = data;
    //   // },
    //   data => {
    //     this.students = data;//aqui this se refiere al comp
    //     console.log(this.students);
    //   },
    //   function(err){
        
    //   },
    //   function(){
    //     console.log("END");
    //   }
    // )
  }

  updateStudent(student: Student,input: HTMLInputElement){
    this.service.updateSudent(student);
    input.value="";
  }
  
}
