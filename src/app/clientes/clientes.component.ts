import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';


@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html'
})
export class ClientesComponent {

  clientes:Cliente[];

  constructor(
    private clienteService: ClienteService
    ){

  }

  ngOnInit(){
    // Iniciamos los clientes
    this.clienteService.getClientes().subscribe(
      /*
      llamamos a través de una función anonima a los clientes que nos entrega getClientes
      Esta función anonima se encarga de asignar el valor al cliente component
      */
      clientes => this.clientes = clientes
      /*
      Esta función anónima es lo mismo que:
      function (clientes){
        this.clientes = clientes
      }

      */

    );
  }

}
