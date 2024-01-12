import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from '../interface/student';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class StudentService {
  createStudent(formData: Student) {
    throw new Error('Method not implemented.');
  }

  private apiServerUrl = 'http://localhost:8080' ;

  constructor(private http: HttpClient) { }

  public getStudent(): Observable<Student[]>{
    return this.http.get<any[]>(`${this.apiServerUrl}/api/etudiant/all`)
  }


  getStudentByID(id: number): Observable<any> {
    const endpoint = `${this.apiServerUrl}/students/find/${id}`;
    return this.http.get<any>(endpoint);
  }


 /* public addStudent(student: Student): Observable<Student>{
    return this.http.post<Student>(`${this.apiServerUrl}/api/etudiant/create`,student)
  }*/



  public addStudent(student: any): Observable<any>{
    return this.http.post<any>(`${this.apiServerUrl}/api/etudiant/create`,student)
  }

  public updateStudent(student: any): Observable<any>{
    return this.http.put<any>(`${this.apiServerUrl}/student/update`,student)
  }

  public deleteStudent(id: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/student/delete/${id}`)
  }
}
