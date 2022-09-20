import { Component, EventEmitter, Input, OnInit,Output } from '@angular/core';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-greet',
  templateUrl: './greet.component.html',
  styleUrls: ['./greet.component.css']
})
export class GreetComponent implements OnInit {

  constructor() { }

@Input()  productList: Array<any>=[];


ngOnInit(): void {}


name : string ="Bashi";

isDisabled= false;


  greet():void{
      alert("Hello "+this.name);
  };

//Count change on @Output
public clickCount:number=0;
@Output() onChanged=new EventEmitter<number>();

countChange(count : number){
  count++;
  this.clickCount=count;
  this.onChanged.emit(this.clickCount);
}

}
