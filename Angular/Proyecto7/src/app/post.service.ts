import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient  } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor(private httpClient: HttpClient ) { }

  listar(): Observable<any>{
      return this.httpClient.get("https://jsonplaceholder.typicode.com" +"/posts")
  }
}
