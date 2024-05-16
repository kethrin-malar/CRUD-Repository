import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreatePolicyComponent } from './create-policy/create-policy.component';
import { FormsModule }   from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { DashboardComponent } from './dashboard/dashboard.component';
import { DeletepolicyComponent } from './deletepolicy/deletepolicy.component';



@NgModule({
  declarations: [
    AppComponent,
    CreatePolicyComponent,
    DashboardComponent,
    CreatePolicyComponent,
    DeletepolicyComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
