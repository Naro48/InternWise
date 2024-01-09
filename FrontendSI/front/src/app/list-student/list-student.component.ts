import { Component, OnInit } from '@angular/core';
import { Student } from '../interface/student';
import { StudentService } from '../service/student.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.css']
})
export class ListStudentComponent implements OnInit {
  public students: Student[] | undefined;
  
  constructor(private studentService: StudentService){}
  
  ngOnInit(): void {
    this.getStudents();
  }

  public getStudents(): void {
    this.studentService.getStudent().subscribe(
      (response: Student[]) =>{
        this.students =response;
      },
      (error: HttpErrorResponse)=>{
        alert(error.message);
      }
    )
  }
}
