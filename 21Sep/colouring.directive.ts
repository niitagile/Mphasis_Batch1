//ng g directive colouring
//HostListener--it is applied on methods which execute on demand

import { Directive, ElementRef,Renderer2,HostListener } from '@angular/core'
@Directive({
  selector: '[appColouring]'
})
export class ColouringDirective {

  constructor(private elementRef: ElementRef, private render: Renderer2) {
    //elementRef.nativeElement.style.backgroundColor = 'green'
   // render.setStyle(elementRef.nativeElement,'backgroundColor' , 'blue');
  }

  @HostListener('mouseenter') onMouseEnter(){
      this.setBgColor('yellow');
  }
  @HostListener('mouseleave') onMouseLeave(){
    this.setBgColor('pink');

  }
  setBgColor(color:string){
    this.render.setStyle(this.elementRef.nativeElement,'backgroundColor' , color);
  }


}
