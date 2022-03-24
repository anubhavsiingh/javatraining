import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  name:string='';
  dept:string='';
  powers = ['Smart Coder', 'Super Flexible','Logical Thinker', 'Excellent Analyst'];
  power:any;

  submitted:boolean=false;

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(){
    this.submitted=true;
  }
}
