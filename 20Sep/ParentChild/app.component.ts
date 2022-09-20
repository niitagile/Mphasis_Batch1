import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FirstAngularApp';
  products:Array<any>=[{name:"Rice", price:200},
  {name:"Sugar", price:40}
];

public clickCount:number=0;
onCountChanged(count:number):void{
  this.clickCount=count;
}


}
