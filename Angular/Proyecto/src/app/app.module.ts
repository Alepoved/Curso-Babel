import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { DatabindingComponent } from './databinding/databinding.component';

import { FormsModule } from "@angular/forms";
import { Hijo1Component } from './databinding/hijo1/hijo1.component';
import { Hijo2Component } from './databinding/hijo2/hijo2.component';

@NgModule({
  declarations: [
    AppComponent,
    DatabindingComponent,
    Hijo1Component,
    Hijo2Component
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
