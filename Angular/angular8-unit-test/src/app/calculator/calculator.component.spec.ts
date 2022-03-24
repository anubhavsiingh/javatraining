import { Component } from '@angular/core';
import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculatorComponent } from './calculator.component';

describe('CalculatorComponent', () => {
  let component: CalculatorComponent;
  let fixture: ComponentFixture<CalculatorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CalculatorComponent ]
    })
    .compileComponents();
  });

  //Set up
  beforeEach(() => {
    fixture = TestBed.createComponent(CalculatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    component = new CalculatorComponent();
  });

  //Tear Down
  afterEach(() => {
    component:null;
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should return addition of two numbers', () => {
    expect(component.add(200,50)).toEqual(250);
  });
  it('should return differnce of two numbers', () => {
    expect(component.subtract(200,50)).toEqual(150);
  });
  it('should return multiplication of two numbers', () => {
    expect(component.multiply(200,50)).toEqual(10000);
  });
  it('should return division of two numbers', () => {
    expect(component.divide(200,50)).toEqual(4);
  });
});
