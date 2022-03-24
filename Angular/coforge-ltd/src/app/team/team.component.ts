import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
import { Account } from '../account';

@Component({
  selector: 'app-team',
  templateUrl: './team.component.html',
  styleUrls: ['./team.component.css']
})
export class TeamComponent implements OnInit {

  s:string = "";
  account: any= [];
  empId: number = 0;

  /** any: It is a built-in data type in TypeScript
  which helps in describing the type of variable which we are unsure of while writing the code. *
  **/
  users:any;
  constructor(private dataService: DataService) { }

  ngOnInit(): void {
    this.s = this.dataService.helloService();
    this.dataService.getUsers().subscribe(
      (data)=> this.users = data
    );
  }

  getAccounts(){
    return this.dataService.getAccountDetails(this.empId).subscribe(
      (d:{}) => this.account = d
    )
  }
}
