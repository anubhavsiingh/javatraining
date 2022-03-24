import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from './product';

/**
 * Angular makes use of observables as an interface to handle a variety of common
 * asynchronous operations.
 * You can define custom events that send observable output data from a child to a parent component.
The HTTP module uses observables to handle AJAX requests and responses.
The Router and Forms modules use observables to listen for and respond to user-input events.
 */

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  productUrl = 'http://localhost:8085/ims/api/products';

  constructor(private http: HttpClient) { }

  getProducts(): Observable<any>{
    return this.http.get(`${this.productUrl}`);
  }

  newProduct(product:Object): Observable<Object>{
    return this.http.post(`${this.productUrl}`,product);
  } 

  getProduct( id:number):Observable<any>{
    return this.http.get(`${this.productUrl}/${id}`);
  }

  updateProduct( id:number,value:any):Observable<Object>{
    return this.http.put(`${this.productUrl}/${id}`,value);
  }

  deleteProduct(id: number): Observable<any> {
    return this.http.delete(`${this.productUrl}/${id}`, { responseType: 'text' });
  }
}
