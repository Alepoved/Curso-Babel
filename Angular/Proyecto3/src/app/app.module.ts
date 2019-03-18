import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ServicesComponent } from './services/services.component';
import { AComponent } from './services/a/a.component';
import { BComponent } from './services/b/b.component';
import { TareasComponent } from './tareas/tareas.component';
import { AgregarTareaComponent } from './tareas/agregar-tarea/agregar-tarea.component';
import { ListaTareasComponent } from './tareas/lista-tareas/lista-tareas.component';




@NgModule({
  declarations: [
    AppComponent,
    ServicesComponent,
    AComponent,
    BComponent,
    TareasComponent,
    AgregarTareaComponent,
    ListaTareasComponent,
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
