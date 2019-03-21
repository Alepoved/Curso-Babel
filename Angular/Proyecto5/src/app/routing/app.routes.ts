import {RouterModule, Routes } from "@angular/router";
import { InicioComponent } from './inicio/inicio.component';
import { NuevoUsuarioComponent } from './nuevo-usuario/nuevo-usuario.component';
import { UsuarioComponent } from './usuario/usuario.component';
import { USUARIOS_ROUTES } from './inicio/usuarios.routes';
import { FormularioComponent } from '../formulario/formulario.component';

const APP_ROUTES: Routes = [
    {path: "", redirectTo: "usuarios", pathMatch: "full"},
    {path: "inicio", component: InicioComponent},
    {path: "usuarios",component: InicioComponent, children: USUARIOS_ROUTES},
    {path: "usuario/:id",component: UsuarioComponent},
    {path: "nuevo-usuario",component: NuevoUsuarioComponent},
    {path: "formulario",component: FormularioComponent},
];

export const ROUTING = RouterModule.forRoot(APP_ROUTES);
