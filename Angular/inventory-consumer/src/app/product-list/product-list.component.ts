import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { ProductService } from '../product.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products!: Observable<Product[]>;

  constructor(private proService: ProductService,private router:Router) { }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData(){

    this.products=this.proService.getProducts();

  }

  editProduct(id:number){
    this.router.navigate(['update',id])  // navigate to component from a method
  }

  deleteProduct(id: number) {
    this.proService.deleteProduct(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  productDetails(id:number){
    this.router.navigate(['details', id]);
  }
}
