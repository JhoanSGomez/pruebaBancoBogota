import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { InformationBasic } from './pages/info-basic/info-basic.component';
import { ConsulterInfoComponent } from './pages/consulter-info/consulter-info.component';


const routes: Routes = [
  {path: 'information', component: InformationBasic},
  {path: 'client', component: ConsulterInfoComponent},
  {path: '**', redirectTo: 'client', pathMatch: 'full'},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
