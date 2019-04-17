import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { JuegoComponent } from './juego/juego.component';
import { CategoriasComponent } from './categorias/categorias.component';
import { ROUTING } from './app.routes';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    JuegoComponent,
    CategoriasComponent
  ],
  imports: [
    BrowserModule,
    ROUTING,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
