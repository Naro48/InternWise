import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProfService {
  private apiServerUrl = 'http://localhost:8080' ;

  constructor(private http: HttpClient) { }

  public getProf(): Observable<any[]>{
    return this.http.get<any[]>(`${this.apiServerUrl}/api/prof/all`)
  }
  
}
