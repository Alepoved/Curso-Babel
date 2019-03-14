import { Component, OnInit } from '@angular/core';
import { LogService } from './log.service';
import { DatosService } from './datos.service';

@Component({
  selector: 'app-services',
  templateUrl: './services.component.html',
  styleUrls: ['./services.component.css'],
  providers: [DatosService]
})
export class ServicesComponent implements OnInit {

  constructor(private logService: LogService) { }

  ngOnInit() {
  }

  mostrarMsg(){
    // console.log("Un mensaje");
    this.logService.mostrarMsg("Un mensaje por el log");
  }

}
