import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { RoutingComponent } from './routing/routing.component';
import { InicioComponent } from './routing/inicio/inicio.component';
import { NuevoUsuarioComponent } from './routing/nuevo-usuario/nuevo-usuario.component';
import { ROUTING } from './routing/app.routes';
import { UsuarioComponent } from './routing/usuario/usuario.component';
import { EditarComponent } from './routing/inicio/editar/editar.component';
import { InfoComponent } from './routing/inicio/info/info.component';
import { FormularioComponent } from './formulario/formulario.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    RoutingComponent,
    InicioComponent,
    NuevoUsuarioComponent,
    UsuarioComponent,
    EditarComponent,
    InfoComponent,
    FormularioComponent
  ],
  imports: [
    BrowserModule,
    ROUTING,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
