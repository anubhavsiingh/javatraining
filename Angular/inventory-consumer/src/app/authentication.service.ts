import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Dealer } from './dealer';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  baseUrl = 'http://localhost:8085/ims/api/dealers';
  d:Dealer | any;
  b: boolean = false;

  constructor(private http: HttpClient) { }

  getDealersList(): Observable<any>{
    return this.http.get(`${this.baseUrl}`);
  }

  saveDealer(dealer:Object):Observable<Object>{
    return this.http.post(`${this.baseUrl}`,dealer);
  }

  loginUrl = 'http://localhost:8085/ims/api/dealer';
  
  loginData(dealer:Dealer):Observable<boolean>{
    return this.http.post<boolean>(`${this.loginUrl}`,dealer);
  }

  authenticate(username:string,password:string): boolean {

    this.d = new Dealer(username,password);
    this.loginData(this.d).subscribe(
      data => this.b = data
    ); 
    if (this.b){
      sessionStorage.setItem('username', username);
      return true;
    }
    else {
      return false;
    }
  }

  //authenticate(username:string,password:string): boolean {

    //=== (Triple equals) is a strict equality comparison operator in JavaScript,
    // which returns false for the values which are not of a similar type. i.e Checks both value and datatype
    /*if (username === "admin" && password === "redhat") {
      sessionStorage.setItem('username', username)
      return true;
    } else {
      return false;
    }

  } */

  isUserLoggedIn() {
    let user = sessionStorage.getItem('username')
    console.log(!(user === null))
    return !(user === null)
  }
 
  logOut() {
    sessionStorage.removeItem('username')
  }
}
