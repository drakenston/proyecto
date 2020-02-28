import { Component, OnInit } from '@angular/core';
import { Ventas } from '../ventas';
import { Router } from '@angular/router';
import { ventasService } from '../ventas.service';

@Component({
  selector: 'app-create-ventass',
  templateUrl: './create-ventass.component.html',
  styleUrls: ['./create-ventass.component.css']
})
export class CreateVentasComponent implements OnInit {

  venta: Ventas = new Ventas();
  submitted = false;

  constructor(private employeeService: ventasService,
    private router: Router) { }

  ngOnInit() {
  }

  newEmployee(): void {
    this.submitted = false;
    this.venta = new Ventas();
  }

  save() {
    this.employeeService.crearVenta(this.venta)
      .subscribe(data => console.log(data), error => console.log(error));
    this.venta = new Ventas();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    // this.router.navigate(['/ventas']);
  }
}
