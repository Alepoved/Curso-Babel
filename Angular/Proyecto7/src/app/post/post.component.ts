import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { PostService } from '../post.service';
import { listLazyRoutes } from '@angular/compiler/src/aot/lazy_routes';
import { Post } from '../post';
import { UserService } from '../user.service';
import { User } from '../user';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {


  listaPost:Post;
  listaUser:any;


  constructor(private postService: PostService,private userService: UserService) {
    this.listarPost();
    
   }

  ngOnInit() {
  
  }

  listarPost(){
    let observable = this.postService.listar()
      observable.subscribe(
        data => this.buscarUsuarios(data),
        // data => this.listaPost = data,
        err => console.log(err)
    )  
  }

  listaUsers(){
    let observable = this.userService.listar()
      observable.subscribe(
        data => this.listaUser = data,
        err => console.log(err)
    )  
  }

  buscarUsuarios(data){
    // this.listaPost = data;
    for(let post of data){
      this.userService.buscarUser(post.userId).subscribe(
        data => this.listaUser = data,
        err => console.log(err)
      );
    }
  }



}
