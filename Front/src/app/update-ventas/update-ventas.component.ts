import { Component, OnInit } from '@angular/core';
import { Ventas } from '../ventas';
import { ActivatedRoute, Router } from '@angular/router';
import {ventasService } from '../ventas.service';

@Component({
  selector: 'app-update-ventass',
  templateUrl: './update-ventass.component.html',
  styleUrls: ['./update-ventass.component.css']
})
export class UpdateVentasComponent implements OnInit {

  id: number;
  employee: Ventas;

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeService: ventasService) { }

  ngOnInit() {
    this.employee = new Ventas
    this.id = this.route.snapshot.params['id'];
    
    this.employeeService.getVenta(this.id)
      .subscribe(data => {
        console.log(data)
        this.employee = data;
      }, error => console.log(error));
  }

  updateEmployee() {
    this.employeeService.actualizaVenta(this.id, this.employee)
      .subscribe(data => console.log(data), error => console.log(error));
    this.employee = new Ventas();
    this.gotoList();
  }

  onSubmit() {
    this.updateEmployee();    
  }

  gotoList() {
    this.router.navigate(['/ventas']);
  }
}