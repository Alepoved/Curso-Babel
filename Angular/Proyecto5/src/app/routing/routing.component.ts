import { Component, OnInit } from '@angular/core';
import { ContadorService } from './contador.service';

@Component({
  selector: 'app-routing',
  templateUrl: './routing.component.html',
  styleUrls: ['./routing.component.css']
})
export class RoutingComponent implements OnInit {

  constructor(private contadorService: ContadorService) { }

  ngOnInit() {
  }

}
