import { Component, OnInit } from '@angular/core';
import { Observable,Observer } from 'rxjs';

@Component({
  selector: 'app-pipe-demo',
  templateUrl: './pipe-demo.component.html',
  styleUrls: ['./pipe-demo.component.css']
})
export class PipeDemoComponent implements OnInit {

  presentDate: Date = new Date();

  title = 'coforge Tehnologies';
  todaydate = new Date();
  jsonval = {name: 'Alex', age: '25', address:{a1: 'Paris', a2: 'France'}};
  months = ['Jan', 'Feb', 'Mar', 'April', 'May', 'Jun',
    'July', 'Aug', 'Sept', 'Oct', 'Nov', 'Dec'];
  constructor() { }

  ngOnInit(): void {
  }
  timeChange = new Observable<string>((observer: Observer<string>) => {
    setInterval(() => observer.next(new
    Date().toString()), 1000);
 });

}
