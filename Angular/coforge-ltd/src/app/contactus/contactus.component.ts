import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup,Validators } from '@angular/forms';

@Component({
  selector: 'app-contactus',
  templateUrl: './contactus.component.html',
  styleUrls: ['./contactus.component.css']
})
export class ContactusComponent implements OnInit {

  
messageForm: FormGroup; // chk & validate for a group of form controls
submitted = false; //flag for successful form submission
success = false; // flag for sucessful form validation

  constructor(private formBuilder:FormBuilder) {
    this.messageForm = this.formBuilder.group({
      name: ['', Validators.required],
      message: ['', Validators.required]
      });
   }

  ngOnInit(): void {
    
  }

  onSubmit() {
    this.submitted = true;
    if (this.messageForm.invalid) {
    return;
    }
    
    this.success = true;
    }

}
