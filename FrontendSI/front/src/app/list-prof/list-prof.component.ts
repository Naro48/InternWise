import { Component } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { faEdit, faTasks, faTrash } from '@fortawesome/free-solid-svg-icons';
import { ActivatedRoute, Router } from '@angular/router';
import { Prof } from '../interface/prof';
import { ProfService } from '../service/prof.service';

@Component({
  selector: 'app-list-prof',
  templateUrl: './list-prof.component.html',
  styleUrls: ['./list-prof.component.css']
})
export class ListProfComponent {
  public profs: Prof[] | undefined;
  
  faTasks = faTasks;
  faEdit = faEdit;
  faDelete = faTrash;

  constructor(private profService: ProfService,
              private http: HttpClient,
              private router: Router,
              private route: ActivatedRoute
    ){}
  
  ngOnInit(): void {
    this.getProfs();
  }

  public getProfs(): void {
    this.profService.getProf().subscribe(
      (response: Prof[]) =>{
        this.profs =response;
      },
      (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    )
  }

}
