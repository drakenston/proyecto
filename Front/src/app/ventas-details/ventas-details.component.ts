import { Ventas } from '../ventas';
import { Component, OnInit, Input } from '@angular/core';
import { ventasService } from '../ventas.service';
import { VentasListComponent } from '../ventas-list/ventas-list.component';
import { Router, ActivatedRoute } from '@angular/router';



@Component({
  selector: 'app-ventas-details',
  templateUrl: './ventas-details.component.html',
  styleUrls: ['./ventas-details.component.css']
})
export class VentasDetailsComponent implements OnInit {

  id: number;
  venta: Ventas;

  constructor(private route: ActivatedRoute,private router: Router,
    private employeeService: ventasService) { }

  ngOnInit() {
    this.venta = new Ventas();

    this.id = this.route.snapshot.params['id'];
    
    this.employeeService.getVenta(this.id)
      .subscribe(data => {
        console.log(data)
        this.venta = data;
      }, error => console.log(error));
  }

  list(){
    this.router.navigate(['employees']);
  }
}
