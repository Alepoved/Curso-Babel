import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TextoComponent } from './texto/texto.component';
import { FiltroPipe } from './texto/filtro.pipe';
import { CVComponent } from './cotenedor/cv/cv.component';
import { InformacionComponent } from './cotenedor/informacion/informacion.component';
import { CotenedorComponent } from './cotenedor/cotenedor.component';

@NgModule({
  declarations: [
    AppComponent,
    TextoComponent,
    FiltroPipe,
    CVComponent,
    InformacionComponent,
    CotenedorComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
