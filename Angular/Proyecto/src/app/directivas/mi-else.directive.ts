import { Directive, TemplateRef, ViewContainerRef, Input } from '@angular/core';

@Directive({
  selector: '[appMiElse]'
})
export class MiElseDirective{


  constructor(private templateRef: TemplateRef<any>, private viewContainerRef: ViewContainerRef) { }

  @Input() set appMiElse(condicion : boolean) {
    if(condicion) {
      this.viewContainerRef.clear();
    }else{
      this.viewContainerRef.createEmbeddedView(this.templateRef);
    }
  }

}
