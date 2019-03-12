import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { DatabindingComponent } from './databinding/databinding.component';

import { FormsModule } from "@angular/forms";
import { Hijo1Component } from './databinding/hijo1/hijo1.component';
import { Hijo2Component } from './databinding/hijo2/hijo2.component';
import { PipesComponent } from './pipes/pipes.component';
import { DoublePipe } from './pipes/double.pipe';
import { ReversePipe } from './pipes/reverse.pipe';
import { FilterPipe } from './pipes/filter.pipe';
import { DirectivasComponent } from './directivas/directivas.component';
import { MarcarDirective } from './directivas/marcar.directive';
import { MiElseDirective } from './directivas/mi-else.directive';


@NgModule({
  declarations: [
    AppComponent,
    DatabindingComponent,
    Hijo1Component,
    Hijo2Component,
    PipesComponent,
    DoublePipe,
    ReversePipe,
    FilterPipe,
    DirectivasComponent,
    MarcarDirective,
    MiElseDirective,
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
