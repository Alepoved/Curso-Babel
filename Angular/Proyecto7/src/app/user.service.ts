import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient  } from '@angular/common/http';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient: HttpClient) { }

  listar(): Observable<any>{
    return this.httpClient.get("https://jsonplaceholder.typicode.com"+"/users")
  }

  buscarUser(id:number): Observable<any>{
    return this.httpClient.get<User>("https://jsonplaceholder.typicode.com/users/"+id);
  }
}
