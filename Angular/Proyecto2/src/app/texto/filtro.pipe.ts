import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filtro'
})
export class FiltroPipe implements PipeTransform {

  transform(value: string, arg1: any, arg2:any): any {
    
   let re;
   var res;
    
    arg1.forEach(elem => {
      re = new RegExp(elem,"g");
      res = value.replace(re, "$");
      value = res;
    });

    return value.split(" ").filter(elem => {
      return !elem.includes(arg2);
    }).join(" ");

  }

}
