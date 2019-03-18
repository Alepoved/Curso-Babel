import { Injectable } from '@angular/core';
import { CanDeactivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

export interface CmpCanDeactivate{
  canDeactivate: () => Observable<boolean> | Promise<boolean> | boolean;
}

@Injectable({
  providedIn: 'root'
})
export class EditarGuard implements CanDeactivate<CmpCanDeactivate> {
  canDeactivate(component: CmpCanDeactivate, 
    currentRoute: ActivatedRouteSnapshot, 
    currentState: RouterStateSnapshot,
    nextState?: RouterStateSnapshot): boolean | UrlTree | Observable<boolean | UrlTree> | Promise<boolean | UrlTree> {
    return component.canDeactivate ? component.canDeactivate() : true;
  }
 
}
