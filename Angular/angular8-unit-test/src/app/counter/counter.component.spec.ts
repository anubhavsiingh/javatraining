import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';

import { CounterComponent } from './counter.component';

describe('CounterComponent', () => {
  let component: CounterComponent;
  let fixture: ComponentFixture<CounterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CounterComponent ],
      imports: [FormsModule]          //For ngModel Import this
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CounterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should check incremented values greater than zero', () => {
    //const cnt=component.increaseCounter;
    expect(component.increaseCounter()).toBeGreaterThan(-1);
  });

  it('should check decremented values less than or equal to zero', () => {
    const cnt1=component.decreaseCounter();
    expect(cnt1).toBeLessThan(2);
  });
  
  //Testing template view
  it('should rendor title in h1 and h3 tag', () => {
    //to get the native element of the compiled html document
    const compiled = fixture.debugElement.nativeElement;
    expect(compiled.querySelector('h1').textContent).toContain('Angular Unit Testing');
    expect(compiled.querySelector('h3').textContent).toContain('ngModel Demo'); 
    //contain will be true if there is something else also with given bit equals will return false
  });

  //testing business logic class
  it('should rendor title as Angular Unit Testing', () => {
    expect(component.title).toEqual('Angular Unit Testing');
  });

  //One way data binding
  it('should bind input value to component property', () => {
    //to get the native element of the compiled html document
    const compiled = fixture.debugElement.nativeElement;
    const inputName:HTMLInputElement = compiled.querySelector('#nameId');
    const inputAge:HTMLInputElement = compiled.querySelector('#ageId');

    inputName.value = "Anubhav";
    inputAge.value = "21";
    
    //Event Binding to input fields
    inputName.dispatchEvent(new Event("input"));
    inputAge.dispatchEvent(new Event("input"));
    
    expect(component.name).toBe('Anubhav');
    expect(component.age.toString()).toBe("21");
    
  });

  //Two way data binding
  it('should perform display binding in HTML Template', () => {
    //to get the native element of the compiled html document
    const compiled = fixture.debugElement.nativeElement;
    const inputName:HTMLInputElement = compiled.querySelector('#nameId');
    const inputAge:HTMLInputElement = compiled.querySelector('#ageId');

    const displayName:HTMLInputElement = compiled.querySelector('#disName');
    const displayAge:HTMLInputElement = compiled.querySelector('#disAge');

    inputName.value = "Anubhav";
    inputAge.value = "21";
    
    //Event Binding to input fields
    inputName.dispatchEvent(new Event("input"));
    inputAge.dispatchEvent(new Event("input"));

    fixture.detectChanges();
    
    expect(displayName.textContent).toBe(inputName.value);
    expect(displayAge.textContent).toBe(inputAge.value);
    
  });
});
