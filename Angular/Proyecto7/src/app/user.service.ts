import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient  } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient: HttpClient) { }

  listar(): Observable<any>{
    return this.httpClient.get("https://jsonplaceholder.typicode.com" +"/users")
  }

  buscarUser(id){
    return this.httpClient.get("https://jsonplaceholder.typicode.com/users/" +id);
  }
}
