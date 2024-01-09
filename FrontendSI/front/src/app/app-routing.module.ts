import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AddStageComponent } from './add-stage/add-stage.component';
import { AddStudentComponent } from './add-student/add-student.component';
import { ListStudentComponent } from './list-student/list-student.component';
import { ListProfComponent } from './list-prof/list-prof.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'dashboard' , component: DashboardComponent},
  { path: 'addstage' , component: AddStageComponent},
  { path: 'addstudent' , component: AddStudentComponent},
  { path: 'liststudent' , component: ListStudentComponent},
  { path: 'listprof' , component: ListProfComponent}


];

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes) // Add this line to configure the routes
  ],
  exports: [RouterModule] // Add this line to export RouterModule for use in other modules
})
export class AppRoutingModule { }

