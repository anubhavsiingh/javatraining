import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductListComponent } from './product-list.component';

//describe is defined to use test suite
describe('ProductListComponent', () => {
  let component: ProductListComponent;
  let fixture: ComponentFixture<ProductListComponent>;

  //Test bed is used to integrate business logic to views or other component
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  //It is used to define individual Unit test case
  it('should create', () => {
    expect(component).toBeTruthy(); //Perform assertions
  });

  it(`should have as title 'Product List Component'`, () => {
    const fixture = TestBed.createComponent(ProductListComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('Product List Component');
  });

  it('should say hello', () => {
    expect(component.sayHello()).toEqual('Hello World');
  });
});
