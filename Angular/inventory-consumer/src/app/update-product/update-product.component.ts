import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Router,ActivatedRoute } from '@angular/router';
import { Product } from '../product';
import { ProductService } from '../product.service';

 /*  ActivatedRoute carries the information about a route linked to a component loaded into the Angular app template. 
An ActivatedRoute contains the router state tree within the angular app’s memory
 
Snapshot – This is the current snapshot of this route.
 
*/

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {

  id: number=0;
  product: Product= new Product();
  submitted = false;
  products: Observable<Product[]> | undefined;

  constructor(private productService: ProductService,private router:Router,
              private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.product = new Product();
    this.id = this.route.snapshot.params['id'];
     this.productService.getProduct(this.id)
     .subscribe(data => {
       console.log(data)
       this.product = data;
     }, error => console.log(error));
  }

  updateProduct() {
    this.productService.updateProduct(this.id, this.product)
      .subscribe(data => console.log(data), error => console.log(error));
    this.product = new Product();
    //this.reloadData();
    this.gotoList();
  }
 
  onSubmit() {
    this.updateProduct();    
  }
  reloadData() {
    this.products = this.productService.getProducts();
  }
  gotoList() {
    this.router.navigate(['/products']).then(() => {
      window.location.reload();
    });
  }

}
