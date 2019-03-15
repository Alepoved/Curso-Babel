import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ToDoListComponent } from './to-do-list/to-do-list.component';
import { ListaTareasComponent } from './to-do-list/lista-tareas/lista-tareas.component';
import { AgregarTareaComponent } from './to-do-list/agregar-tarea/agregar-tarea.component';
import { FormulariosComponent } from './formularios/formularios.component';
import { FormPlantillaComponent } from './formularios/form-plantilla/form-plantilla.component';
import { FormReactivoComponent } from './formularios/form-reactivo/form-reactivo.component';


@NgModule({
  declarations: [
    AppComponent,
    ToDoListComponent,
    ListaTareasComponent,
    AgregarTareaComponent,
    FormulariosComponent,
    FormPlantillaComponent,
    FormReactivoComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
