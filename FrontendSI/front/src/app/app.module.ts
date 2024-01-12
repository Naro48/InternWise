import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AppRoutingModule } from './app-routing.module';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { HeaderComponent } from './header/header.component';
import { FormsModule } from '@angular/forms';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HeaderDashComponent } from './header-dash/header-dash.component';
import { SideNavComponent } from './side-nav/side-nav.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { MainComponent } from './main/main.component';
import { AddStageComponent } from './add-stage/add-stage.component';
import { AddStudentComponent } from './add-student/add-student.component';
import { ListStudentComponent } from './list-student/list-student.component';
import { ListProfComponent } from './list-prof/list-prof.component';
import { ListTypeStageComponent } from './list-type-stage/list-type-stage.component';
import { AddStudentFormComponent } from './add-student-form/add-student-form.component';
import { ListStageComponent } from './list-stage/list-stage.component';
import { AddStageFormComponent } from './add-stage-form/add-stage-form.component';
import { AddStageForm1Component } from './add-stage-form-1/add-stage-form-1.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HeaderComponent,
    DashboardComponent,
    HeaderDashComponent,
    SideNavComponent,
    MainComponent,
    AddStageComponent,
    AddStudentComponent,
    ListStudentComponent,
    ListProfComponent,
    ListTypeStageComponent,
    AddStudentFormComponent,
    ListStageComponent,
    AddStageFormComponent,
    AddStageForm1Component
  ],
  imports: [
    RouterModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    FontAwesomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
