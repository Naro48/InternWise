import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Stage } from '../interface/stage';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StageService {

  private apiServerUrl = 'http://localhost:8080' ;

  constructor(private http: HttpClient) { }

  public getStage(): Observable<Stage[]>{
    return this.http.get<Stage[]>(`${this.apiServerUrl}/api/interns/all`)
  }
  
  getStageByID(id: number): Observable<Stage> {
    const endpoint = `${this.apiServerUrl}/stages/find/${id}`;
    return this.http.get<Stage>(endpoint);
  }

  addStage(stageData: Stage): Observable<Stage> {
    return this.http.post<Stage>(this.apiServerUrl + '/add', stageData);
  }

  updateStage(stageData: Stage): Observable<Stage> {
    return this.http.put<Stage>(this.apiServerUrl + '/update', stageData);
  }

}
