import { Pipe, PipeTransform } from '@angular/core';
import { restoreView } from '@angular/core/src/render3';

@Pipe({
  name: 'double'
})
export class DoublePipe implements PipeTransform {

  transform(value: number, arg1?: any, arg2?: any): any {
   let res = value *2;

   if(arg1) res+=arg1;
   if(arg2) res-=arg2;

   return res;
  }

}
