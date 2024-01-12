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
    return this.http.get<Student[]>(`${this.apiServerUrl}/api/etudiant/all`)
  }


  getStudentByID(id: number): Observable<Student> {
    const endpoint = `${this.apiServerUrl}/students/find/${id}`;
    return this.http.get<Student>(endpoint);
  }


  public addStudent(student: Student): Observable<Student>{
    return this.http.post<Student>(`${this.apiServerUrl}/student/add`,student)
  }

  public updateStudent(student: Student): Observable<Student>{
    return this.http.put<Student>(`${this.apiServerUrl}/student/update`,student)
  }

  public deleteStudent(id: number): Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/student/delete/${id}`)
  }
}
