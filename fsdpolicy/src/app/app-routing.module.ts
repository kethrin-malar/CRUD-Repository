import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreatePolicyComponent  } from './create-policy/create-policy.component';


const routes: Routes = [
  { path: 'addpolicy', component: CreatePolicyComponent  }
  
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
