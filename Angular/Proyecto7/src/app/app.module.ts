import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PostComponent } from './post/post.component';
import { ListadoPostComponent } from './listado-post/listado-post.component';
import { HttpClientModule } from '@angular/common/http';
import { UserComponent } from './user/user.component'

@NgModule({
  declarations: [
    AppComponent,
    PostComponent,
    ListadoPostComponent,
    UserComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
