import { Component, OnInit, Input } from '@angular/core';
import { PostComponent } from '../post/post.component';
import { Post } from '../post';
import { UseExistingWebDriver } from 'protractor/built/driverProviders';
import { User } from '../user';

@Component({
  selector: 'app-listado-post',
  templateUrl: './listado-post.component.html',
  styleUrls: ['./listado-post.component.css']
})
export class ListadoPostComponent implements OnInit {

  constructor(private postService:PostComponent) { }
  @Input() post: Post;
  @Input() user: User;
  ngOnInit() {
    // this.listaPost = this.postService.listar();
    // console.log(this.user);
  }

}
