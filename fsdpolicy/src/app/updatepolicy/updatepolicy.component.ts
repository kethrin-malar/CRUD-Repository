// update-policy.component.ts
import { Component, OnInit } from '@angular/core';
import { Policy } from '../policy';
import { PolicyService } from '../policy.service';


@Component({
  selector: 'app-update-policy',
  templateUrl: './updatepolicy.component.html',
  styleUrls: ['./updatepolicy.component.css']
})
export class UpdatePolicyComponent implements OnInit {
  policies: Policy[] = [];
  selectedPolicy: Policy | null = null;

  constructor(private policyService: PolicyService) { }

  ngOnInit(): void {
    this.policyService.getAllPolicies().subscribe(data => {
      this.policies = data;
    });
  }

  onSelect(policy: Policy): void {
    this.selectedPolicy = { ...policy }; // Clone the selected policy
  }

  onUpdate(): void {
    if (this.selectedPolicy) {
      this.policyService.updatePolicy(this.selectedPolicy.id, this.selectedPolicy).subscribe(response => {
        alert(response);
        this.selectedPolicy = null; // Clear the form after update
        this.ngOnInit(); // Refresh the policy list
      });
    }
  }
}
