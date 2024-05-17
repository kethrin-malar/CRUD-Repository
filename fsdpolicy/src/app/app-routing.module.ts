import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreatePolicyComponent  } from './create-policy/create-policy.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { DeletepolicyComponent } from './deletepolicy/deletepolicy.component';
import { UpdatePolicyComponent } from './updatepolicy/updatepolicy.component';



const routes: Routes = [
  { path: 'addpolicy', component: CreatePolicyComponent  },
  { path: 'dashboard', component: DashboardComponent  },
  { path: 'updatepolicy', component: UpdatePolicyComponent } ,
  { path: 'deletepolicy', component: DeletepolicyComponent } ,
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
