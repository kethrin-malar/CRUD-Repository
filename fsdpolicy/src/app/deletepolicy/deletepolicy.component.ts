import { Component, OnInit } from '@angular/core';
import { PolicyService } from '../policy.service';

@Component({
  selector: 'app-deletepolicy',
  templateUrl: './deletepolicy.component.html',
  styleUrls: ['./deletepolicy.component.css']
})
export class DeletepolicyComponent implements OnInit {
  policyId: string;
  errorMessage: string;

  constructor(private policyService: PolicyService) { }

  ngOnInit(): void {
  }

  deletePolicy() {
    this.policyService.deletePolicy(this.policyId)
      .subscribe(
        response => {
          // Handle successful deletion
          console.log('Policy deleted successfully');
          // You can add further logic here, like refreshing the policy list
        },
        error => {
          // Handle error
          console.error('Error deleting policy:', error);
          this.errorMessage = 'Error deleting policy. Please try again later.';
        }
      );
  }
}
