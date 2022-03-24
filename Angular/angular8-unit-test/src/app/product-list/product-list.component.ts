import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  title:string = "Product List Component";
  constructor() { }

  ngOnInit(): void {
  }

  sayHello(){
    return "Hello World";
  }
}
