import { Component, OnInit } from '@angular/core';
import { Student } from '../interface/student';
import { StudentService } from '../service/student.service';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { faEdit, faTasks, faTrash } from '@fortawesome/free-solid-svg-icons';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-list-student',
  templateUrl: './list-student.component.html',
  styleUrls: ['./list-student.component.css']
})
export class ListStudentComponent implements OnInit {
  public students: Student[] | undefined;
  
  faTasks = faTasks;
  faEdit = faEdit;
  faDelete = faTrash;

  constructor(private studentService: StudentService,
              private http: HttpClient,
              private router: Router,
              private route: ActivatedRoute
    ){}
  
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


  
  onSubmit(studentId: number) {
    this.router.navigate(['/addstudent'], { queryParams: { studentId: studentId } });
  }

  delete(studentId: number) {
    this.studentService.deleteStudent(studentId).subscribe(
      (response: any) => {
        console.log('deleted');
        this.ngOnInit();
      },
      (error) => {
        console.error('erreur');
      }
    );
  }
}
