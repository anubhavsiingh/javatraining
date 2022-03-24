import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-counter',
  templateUrl: './counter.component.html',
  styleUrls: ['./counter.component.css']
})
export class CounterComponent implements OnInit {

  private counter:number=0;
  name:string="";
  age:number=0;
  title:string="Angular Unit Testing";
  constructor() { }

  ngOnInit(): void {
  }

  // increment
  public increaseCounter(): number {
  this.counter++;
   return this.counter;
   }

  // decrement
  public decreaseCounter(): number {
   this.counter--;
   return this.counter;

  }
}
