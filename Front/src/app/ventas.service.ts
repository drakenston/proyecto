import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ventasService {
  

  
  private remoto = 'http://localhost:8080/springboot-crud-rest/api/v1/ventas';

  //private remoto = 'http://localhost:27017/springboot-crud-rest/api/v1/ventas/';

  constructor(private http: HttpClient) { }
  getVenta(OrderId: number): Observable<any> {
    return this.http.get(`${this.remoto}/${OrderId}`);
  }
  

  crearVenta(venta: Object): Observable<Object> {
    return this.http.post(`${this.remoto}`, venta);
  }

  actualizaVenta(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.remoto}/${id}`, value);
  }

  borrarVenta(id: number): Observable<any> {
    return this.http.delete(`${this.remoto}/${id}`, { responseType: 'text' });
  }



  getEmployeesList(): Observable<any> {
    return this.http.get(`${this.remoto}`);
  }
}