import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-informacion',
  templateUrl: './informacion.component.html',
  styleUrls: ['./informacion.component.css']
})
export class InformacionComponent implements OnInit {

  @Input() nombre ="";
  @Input() apellido ="";
  @Input() fechaN ="";
  @Input() skills=[];
  @Input() email ="";
  @Input() imagen ="";
  
  constructor() { }

  ngOnInit() {
  }

}
