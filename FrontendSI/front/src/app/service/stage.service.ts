import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StageService {

  private apiServerUrl = 'http://localhost:8080' ;

  constructor(private http: HttpClient) { }

  public getStage(): Observable<any[]>{
    return this.http.get<any[]>(`${this.apiServerUrl}/api/interns/all`)
  }
  
  getStageByID(id: number): Observable<any> {
    const endpoint = `${this.apiServerUrl}/stages/find/${id}`;
    return this.http.get<any>(endpoint);
  }

  addStage(stageData: any): Observable<any> {
    return this.http.post<any>(this.apiServerUrl + '/api/interns/create', stageData);
  }

  updateStage(stageData: any): Observable<any> {
    return this.http.put<any>(this.apiServerUrl + '/update', stageData);
  }

}
