import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-hijo2',
  templateUrl: './hijo2.component.html',
  styleUrls: ['./hijo2.component.css']
})
export class Hijo2Component implements OnInit {

  nombre: string = "Nombre Hijo2";
  @Input() nombreHermano: string = "";
  @Input() nombrePadre = "";
  constructor() { }

  ngOnInit() {
  }

}
