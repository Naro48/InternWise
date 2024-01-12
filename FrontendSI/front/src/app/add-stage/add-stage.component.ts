import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { faAdd, faSearch, faTasks } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-add-stage',
  templateUrl: './add-stage.component.html',
  styleUrls: ['./add-stage.component.css']
})
export class AddStageComponent {
  faAdd = faAdd; 

  faSearch = faSearch;

  faTasks = faTasks;

  constructor(private router : Router){}

  OnSubmit(){
    this.router.navigate(['/creation/stage']);
  }
}
