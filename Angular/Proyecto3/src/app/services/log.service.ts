import { Injectable } from '@angular/core';

class TimeLogService{
  mostrarMsg(msg){
    console.log(new Date().toDateString() + "Msg: "+msg);
  }
}

@Injectable({
  providedIn: 'root',
  useClass: TimeLogService
})
export class LogService {

  constructor() { }

  mostrarMsg(msg){
    console.log("Mensaje: "+msg);
  }

  
}
