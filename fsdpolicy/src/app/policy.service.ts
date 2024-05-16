import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Policy } from './policy';

@Injectable({
  providedIn: 'root'
})
export class PolicyService {
  delete(policyId: string) {
    throw new Error('Method not implemented.');
  }
  
 
  private policyUrl: string;
  private deleteUrl: string;
 

  constructor(private http: HttpClient) {
    this.policyUrl = 'http://localhost:8080/policy/create';
    this.deleteUrl = 'http://localhost:8080/policy/delete/{id}';
   
  }

  public save(policy: Policy): Observable<Object> {
    return this.http.post(`${this.policyUrl}`, policy, { responseType: 'text' });
  }
  public deletePolicy(policyId: string): Observable<any> {
    const deleteUrl = this.deleteUrl.replace('{id}', policyId);
    return this.http.delete(deleteUrl);
  }
}
