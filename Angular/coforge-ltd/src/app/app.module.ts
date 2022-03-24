import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { HomeComponent } from './home/home.component';
import { NavComponent } from './nav/nav.component';
import { TeamComponent } from './team/team.component';
import { UtilityComponent } from './utility/utility.component';
import { EmployeeComponent } from './employee/employee.component';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';

@NgModule({
  declarations: [
    AppComponent,
    AboutusComponent,
    ContactusComponent,
    HomeComponent,
    NavComponent,
    TeamComponent,
    UtilityComponent,
    EmployeeComponent,
    PipeDemoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
