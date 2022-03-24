import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-aboutus',
  templateUrl: './aboutus.component.html',
  styleUrls: ['./aboutus.component.css']
})
export class AboutusComponent implements OnInit {

  clickCounter:number = 0;
  name:string='Klaus';
  mycolor:string='red';

  name1:string='';
  
  toggleOn=false;
  title:string='ngIf Example';
  showMe:boolean = true;
  
  constructor() { }

  ngOnInit(): void {
  }

  countClick(){
    this.clickCounter = this.clickCounter+1;
  }

  toggleOn1(){
    this.toggleOn = !this.toggleOn;
  }
}
