import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-hijo1',
  templateUrl: './hijo1.component.html',
  styleUrls: ['./hijo1.component.css']
})
export class Hijo1Component implements OnInit {

  nombre = "Nombre hijo 1";
  @Input() nombrePadre = "";

  constructor() { }

  ngOnInit() {
  }

}
