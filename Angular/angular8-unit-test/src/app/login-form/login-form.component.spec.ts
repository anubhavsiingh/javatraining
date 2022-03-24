import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormBuilder } from '@angular/forms';

import { LoginFormComponent } from './login-form.component';

describe('LoginFormComponent', () => {
  let component: LoginFormComponent;
  let fixture: ComponentFixture<LoginFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    /*fixture = TestBed.createComponent(LoginFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();*/
    component = new LoginFormComponent(new FormBuilder);
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should create a form with three controls', () => {
    expect(component.loginForm.contains('name')).toBe(true);
    expect(component.loginForm.contains('password')).toBe(true);
    expect(component.loginForm.contains('email')).toBeTruthy();
  });

  it('should make the name control required', () => {
    let nameControl=component.loginForm.get('name');
    //nameControl.setValue('abc');
    nameControl.setValue('');
    expect(nameControl.valid).toBeFalsy();

  });

  it('should use password with minimum eigth characters', () => {
    let passwordControl=component.loginForm.get('password');
    //passwordControl.setValue('hello12');   Fails because it is less than 8
    passwordControl.setValue('hello123');     //passes here
    expect(passwordControl.valid).toBeTruthy();

  });

  it('should validate email input type', () => {
    let emailControl=component.loginForm.get('email');
    //emailControl.setValue('abcgmail.com');     Will fail here
    emailControl.setValue('anu@gmail.com');
    expect(emailControl.valid).toBeTruthy();

  });
});
