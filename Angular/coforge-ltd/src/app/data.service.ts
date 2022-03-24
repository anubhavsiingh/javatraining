import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Account } from './account';

@Injectable({
  providedIn: 'root'
})
export class DataService {  

  private apiUrl:string = 'https://reqres.in/api/users';
  private baseUrl:string = 'http://localhost:9005/user';

  constructor(private http:HttpClient) { }

  helloService(){
    return "Angular Service";
  }

  getUsers(){
    return this.http.get<any>(this.apiUrl);
  }

  getAccountDetails(empId:number): Observable<Account>{
    return this.http.get<Account>(`${this.baseUrl}/${empId}`);
  }
}
