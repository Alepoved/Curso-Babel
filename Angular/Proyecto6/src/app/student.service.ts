import { Injectable } from '@angular/core';
import { Student } from './student.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  

  students: Student[] = [{
    id: 1,
    name: 'Krunal',
    enrollmentnumber: 110470116021,
    college: 'VVP Engineering College',
    university: 'GTU'
},
{
    id: 2,
    name: 'Rushabh',
    enrollmentnumber: 110470116023,
    college: 'VVP Engineering College',
    university: 'GTU'
},
{
    id: 3,
    name: 'Ankit',
    enrollmentnumber: 110470116022,
    college: 'VVP Engineering College',
    university: 'GTU'
}];
  constructor() { }

  public getStudents(): any{
    const studentObs = new Observable(obs => {
      setTimeout(() =>{
        obs.next(this.students);
      },1000)
    })

    return studentObs;
  }

  updateSudent(student: Student): any {
    this.students.indexOf(student);
  }
}
