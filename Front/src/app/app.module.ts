import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateVentasComponent } from './create-ventas/create-ventas.component';
import { VentasDetailsComponent } from './ventas-details/ventas-details.component';
import { VentasListComponent } from './ventas-list/ventas-list.component';
import { UpdateVentasComponent } from './update-ventas/update-ventas.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    CreateVentasComponent,
    VentasDetailsComponent,
    VentasListComponent,
    UpdateVentasComponent
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
