import { Directive, ElementRef, HostBinding, HostListener, Input, OnInit } from '@angular/core';

@Directive({
  selector: '[appMarcar]'
})
export class MarcarDirective implements OnInit {

  @HostBinding("style.backgroundColor") colorFondo;
  constructor(private elemRef: ElementRef) {
    // elemRef.nativeElement.style.backgroundColor = "blue";
    
  }

  ngOnInit(){
    this.colorFondo = "blue";
  }

}
