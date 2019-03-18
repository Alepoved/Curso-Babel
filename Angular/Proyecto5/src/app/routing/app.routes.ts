import {RouterModule, Routes } from "@angular/router";
import { InicioComponent } from './inicio/inicio.component';
import { NuevoUsuarioComponent } from './nuevo-usuario/nuevo-usuario.component';
import { UsuarioComponent } from './usuario/usuario.component';
import { USUARIOS_ROUTES } from './inicio/usuarios.routes';

const APP_ROUTES: Routes = [
    {path: "", redirectTo: "usuarios", pathMatch: "full"},
    {path: "usuarios",component: InicioComponent, children: USUARIOS_ROUTES},
    {path: "usuario/:id",component: UsuarioComponent},
    {path: "nuevo-usuario",component: NuevoUsuarioComponent},
];

export const ROUTING = RouterModule.forRoot(APP_ROUTES);
