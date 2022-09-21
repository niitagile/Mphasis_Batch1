import { Component } from '@angular/core';
import { AppServiceService } from './app-service.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [AppServiceService] 
})
export class AppComponent {
  title = 'ServiceExample';

  value: string = ""; 
  productList: Array<any>=[];
   constructor(private _appService: AppServiceService) { } 
   ngOnInit(): void { 
      this.value = this._appService.getApp();
      this.productList=this._appService.getProducts(); 
   }   
}
