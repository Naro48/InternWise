import { Component } from '@angular/core';
import { Stage } from '../interface/stage';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { faEdit, faTasks, faTrash } from '@fortawesome/free-solid-svg-icons';
import { ActivatedRoute, Router } from '@angular/router';
import { StageService } from '../service/stage.service';

@Component({
  selector: 'app-list-stage',
  templateUrl: './list-stage.component.html',
  styleUrls: ['./list-stage.component.css']
})
export class ListStageComponent {
  public stages: Stage[] | undefined;

    
  faTasks = faTasks;
  faEdit = faEdit;
  faDelete = faTrash;

  constructor(private studentService: StageService,
    private http: HttpClient,
    private router: Router,
    private route: ActivatedRoute
  ){}

  ngOnInit(): void {
    this.getStages();
  }

  public getStages(): void {
    this.studentService.getStage().subscribe(
      (response: Stage[]) =>{
        this.stages =response;
      },
      (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    )
  }
  
}
