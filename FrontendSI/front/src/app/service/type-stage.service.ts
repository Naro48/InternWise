import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TypeStage } from '../interface/type-stage';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TypeStageService {

  private apiServerUrl = 'http://localhost:8080' ;

  constructor(private http: HttpClient) { }

  public getTypeStage(): Observable<TypeStage[]>{
    return this.http.get<TypeStage[]>(`${this.apiServerUrl}/api/typestage`)
  }
}
