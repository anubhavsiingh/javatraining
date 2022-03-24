import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  private num1:number |any;
  private num2:number | any;

  constructor() { }

  ngOnInit(): void {
  }

  add(num1:number, num2:number):number{
    return (num1 + num2);
    }
  
    subtract(num1:number, num2:number) : number{
    return (num1 - num2);
    }
  
    multiply(num1:number, num2:number): number{
    return (num1 * num2);
    }
  
    divide(num1:number, num2:number):any {
    if(num2 == 0){
      return "Denominator should not be 0";
    }
    else{
      return (num1/num2);
    }
    }

}
