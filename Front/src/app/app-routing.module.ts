import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VentasListComponent } from './ventas-list/ventas-list.component';
import { CreateVentasComponent } from './create-ventas/create-ventas.component';
import { UpdateVentasComponent } from './update-ventas/update-ventas.component';
import { VentasDetailsComponent } from './ventas-details/ventas-details.component';


const routes: Routes = [

  { path: '', redirectTo: 'ventas', pathMatch: 'full' },
  { path: 'ventas', component: VentasListComponent },
  { path: 'add', component: CreateVentasComponent },
  { path: 'update/:id', component: UpdateVentasComponent },
  { path: 'details/:id', component: VentasDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
