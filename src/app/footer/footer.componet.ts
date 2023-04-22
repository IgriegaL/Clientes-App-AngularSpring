import { Component } from "@angular/core";

@Component({
selector:'app-footer',
templateUrl: './footer.component.html'

})
export class FooterComponet {
  // Tipo genérico de cualquier clase particular:
  // Por defecto es public
  public autor:any = {nombre:'Andrés', apellido:'Guzmán'};
}
