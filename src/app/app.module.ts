import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponet } from './footer/footer.componet';
import { DirectivaComponent } from './directiva/directiva.component';
import { ClientesComponent } from './clientes/clientes.component';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

// en las rutas definimos cada ruta de nuestros componentes de nuestra app
const routes: Routes = [
  {path:'',redirectTo:'/clientes', pathMatch:'full'},
  {path: 'directivas', component: DirectivaComponent},
  {path:'clientes', component:ClientesComponent},
]


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponet,
    DirectivaComponent,
    ClientesComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
