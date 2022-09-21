/*cmd 
1. create a new project--> ng new projectname
2. create service ng g s servicename
3. app.component.ts-- inject it and call function
4. add service in app.module.ts
5. display output on app.component.html
*/
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AppServiceService {
  
  constructor() { }
  getApp(): string { 
    return "Hello world"; 
 } 

 getProducts():Array<any>{
 

  return [{name:"Rice", price:200},
          {name:"Sugar", price:40}
        ];

}
}
