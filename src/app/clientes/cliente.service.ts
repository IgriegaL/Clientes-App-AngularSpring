import { Injectable } from '@angular/core';
import { Cliente } from './cliente';
import { Observable } from 'rxjs';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({providedIn: 'root'})
export class ClienteService {

  private apiUrl: string = 'http://localhost:8080/api/clientes';
  private httpHeaders = new HttpHeaders({'Content-Type':'application/json'})

  constructor(private http: HttpClient) { }

  getClientes(): Observable<Cliente[]> {
    return this.http.get(this.apiUrl).pipe(
      map(response => response as Cliente[])
    );
  }
  create(cliente:Cliente): Observable<Cliente> {
    return this.http.post<Cliente>(this.apiUrl,cliente,{headers:this.httpHeaders})
  }

  getCliente(id): Observable<Cliente>{
    return this.http.get<Cliente>(`${this.apiUrl}/${id}`)
  }

  update(cliente:Cliente): Observable<Cliente>{
    return this.http.put<Cliente>(`${this.apiUrl}/${cliente.id}`,cliente,{headers:this.httpHeaders})
  }
  delete(id:number): Observable<Cliente> {

    return this.http.delete<Cliente>(`${this.apiUrl}/${id}`,{headers:this.httpHeaders})

  }
}
