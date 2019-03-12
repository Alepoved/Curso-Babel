import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter',
  pure: false //ejecutar el pipe cada vez que se realice un cambio
})
export class FilterPipe implements PipeTransform {

  transform(value: Array<string>, args?: string): Array<string> {
    const res = [];
    for(let nombre of value){
      if(nombre.match(new RegExp(args,"i")))
        res.push(nombre);
    }
    return res;
  }

}
