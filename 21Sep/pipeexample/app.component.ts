import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pipeexample';
  celcius: number=0;
  Fahrenheit: number=0; 
  toDate: Date = new Date();
numDate=1590319189931;
strDate="Sun May 24 2020 19:16:23"; 
obj={"price":45,
"item" : "Tea"

}
}
