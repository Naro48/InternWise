import { Component, OnInit } from '@angular/core';
import { TypeStage } from '../interface/type-stage';
import { TypeStageService } from '../service/type-stage.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-list-type-stage',
  templateUrl: './list-type-stage.component.html',
  styleUrls: ['./list-type-stage.component.css']
})
export class ListTypeStageComponent implements OnInit{
  public typeStages: TypeStage[] | undefined;

  constructor(private typeStageService: TypeStageService){}


  ngOnInit(): void {
    this.getTypeStages();
  }

  public getTypeStages(): void {
    this.typeStageService.getTypeStage().subscribe(
      (response: TypeStage[]) =>{
        this.typeStages =response;
      },
      (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    )
  }

}
