import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { faAdd, faSearch, faTasks } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.css']
})
export class AddStudentComponent {
  faAdd = faAdd; 

  faSearch = faSearch;

  faTasks = faTasks;

  constructor(private router : Router){}

  OnSubmit(){
    this.router.navigate(['/creation']);
  }
}
