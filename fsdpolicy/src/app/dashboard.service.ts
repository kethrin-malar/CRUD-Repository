import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { Policy } from './policy';
import { Driver } from './driver';

@Injectable({
  providedIn: 'root'
})
export class DashboardService {
  private baseUrl = 'http://localhost:8080/api/dashboard';

  constructor(private http: HttpClient) { }

  getDriverById(id: number): Observable<Driver> {
    return this.http.get<Driver>(`${this.baseUrl}/driver/${id}`);
  }

  

  
}
