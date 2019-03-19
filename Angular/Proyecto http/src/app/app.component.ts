import { Component } from '@angular/core';
import { PersonasService } from './servicios/personas.service';

@Component({
  selector   : 'app-root',
  templateUrl: './app.component.html',
  styleUrls  : ['./app.component.css'],
  providers  : [ /*PersonasService*/ ]
})
export class AppComponent {
}
