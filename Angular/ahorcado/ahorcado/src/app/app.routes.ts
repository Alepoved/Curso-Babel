import { RouterModule, Routes } from '@angular/router';
import { JuegoComponent } from './juego/juego.component';
import { CategoriasComponent } from './categorias/categorias.component';

const APP_ROUTES: Routes = [
    { path: '', redirectTo: 'categorias', pathMatch: 'full' },
    { path: 'categorias', component: CategoriasComponent },
    { path: 'juego/:categoria', component: JuegoComponent },
];

export const ROUTING = RouterModule.forRoot(APP_ROUTES);