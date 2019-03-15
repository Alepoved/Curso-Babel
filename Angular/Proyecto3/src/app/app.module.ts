import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ServicesComponent } from './services/services.component';
import { AComponent } from './services/a/a.component';
import { BComponent } from './services/b/b.component';
import { ListaComponent } from './to-do-list/lista/lista.component';
import { AgregarTareaComponent } from './to-do-list/agregar-tarea/agregar-tarea.component';


@NgModule({
  declarations: [
    AppComponent,
    ServicesComponent,
    AComponent,
    BComponent,
    ListaComponent,
    AgregarTareaComponent,
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
