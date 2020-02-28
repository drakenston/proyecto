import { Component, OnInit } from '@angular/core';

import { Observable } from "rxjs";
import { ventasService } from "../ventas.service";
import { Ventas } from "../ventas";
import { Router } from '@angular/router';

@Component({
  selector: 'app-ventass-list',
  templateUrl: './ventass-list.component.html',
  styleUrls: ['./ventass-list.component.css']
})
export class VentasListComponent implements OnInit {

    
 private objeto=[{
  Region: "EU;",
  Country:"Spain",
  ItemType:"Tomaco",	 
  SalesChannel:"Amazon",
  OrderPriority:"12313131",	
  OrderDate: "21-10-2019",
  OrderID: 1, 
  ShipDate:"21-10-2019",
  UnitsSold:"12",
  UnitPrice:"1",
  UnitCost:"0,70",	
  TotalRevenue:"234",
  TotalCost:"12",
  TotalProfit:"1123"
},{
  Region: "EU;",
  Country:"Spain",
  ItemType:"Tomaco",	 
  SalesChannel:"Amazon",
  OrderPriority:"12313131",	
  OrderDate: "21-10-2019",
  OrderID: 1, 
  ShipDate:"21-10-2019",
  UnitsSold:"12",
  UnitPrice:"1",
  UnitCost:"0,70",	
  TotalRevenue:"234",
  TotalCost:"12",
  TotalProfit:"1123"
},{
  Region: "EU;",
  Country:"Spain",
  ItemType:"Tomaco",	 
  SalesChannel:"Amazon",
  OrderPriority:"12313131",	
  OrderDate: "21-10-2019",
  OrderID: 1, 
  ShipDate:"21-10-2019",
  UnitsSold:"12",
  UnitPrice:"1",
  UnitCost:"0,70",	
  TotalRevenue:"234",
  TotalCost:"12",
  TotalProfit:"1123"
},{
  Region: "Prueba;",
  Country:"string",
  ItemType:"string",	 
  SalesChannel:"string",
  OrderPriority:"string",	
  OrderDate: "Date",
  OrderID: 5, 
  ShipDate:"Date",
  UnitsSold:"number",
  UnitPrice:"number",
  UnitCost:"number",	
  TotalRevenue:"number",
  TotalCost:"number",
  TotalProfit:"number"
},{
  Region: "EU;",
  Country:"Spain",
  ItemType:"Tomaco",	 
  SalesChannel:"Amazon",
  OrderPriority:"12313131",	
  OrderDate: "21-10-2019",
  OrderID: 1, 
  ShipDate:"21-10-2019",
  UnitsSold:"12",
  UnitPrice:"1",
  UnitCost:"0,70",	
  TotalRevenue:"234",
  TotalCost:"12",
  TotalProfit:"1123"
}]
  venta: Observable<Ventas[]>;

  constructor(private ventaService: ventasService,
    private router: Router) {}

  ngOnInit() {
    // this.reloadData();
  }

  reloadData() {
    // this.venta = this.ventaService.getEmployeesList();
  }

  /*

  borrarVenta(id: number) {
    this.ventaService.borrarVenta(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  */

  employeeDetails(id: number){
    // this.router.navigate(['details', id]);
  }
  delete(item) {
    this.objeto.splice(item,1)
  }
  onSubmit(form){
    console.log(form);
    
  }
}