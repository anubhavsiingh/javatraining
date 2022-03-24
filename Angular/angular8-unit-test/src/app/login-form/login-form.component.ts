import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup,Validators,Validator } from '@angular/forms';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  loginForm:FormGroup | any;
  
  constructor(private loginFB: FormBuilder) { 
    this.loginForm = loginFB.group({
 
      name: ['', Validators.required],
      password: ['', Validators.minLength(8)],
      email: ['', Validators.email]

     })
  }

  ngOnInit(): void {
  }

}
