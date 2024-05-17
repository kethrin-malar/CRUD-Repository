import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Policy } from './policy';

@Injectable({
  providedIn: 'root'
})
export class PolicyService {
  baseUrl: any;
  delete(policyId: string) {
    throw new Error('Method not implemented.');
  }
  
 
  private policyUrl: string;
  private deleteUrl: string;
 

  constructor(private http: HttpClient) {
    this.baseUrl = 'http://localhost:8080/policy';
    this.policyUrl = 'http://localhost:8080/policy/create';
    this.deleteUrl = 'http://localhost:8080/policy/delete/{id}';
   
  }

  public save(policy: Policy): Observable<Object> {
    return this.http.post(`${this.policyUrl}`, policy, { responseType: 'text' });
  }
  getAllPolicies(): Observable<Policy[]> {
    return this.http.get<Policy[]>(`${this.baseUrl}/all`);
  }

  updatePolicy(id: number, policy: Policy): Observable<string> {
    return this.http.put<string>(`${this.baseUrl}/update/${id}`, policy);
  }
  public deletePolicy(policyId: string): Observable<any> {
    const deleteUrl = this.deleteUrl.replace('{id}', policyId);
    return this.http.delete(deleteUrl);
  }
}
