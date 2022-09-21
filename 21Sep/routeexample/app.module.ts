import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { CrisisListComponent } from './crisis-list/crisis-list.component';
import { HerosListComponent } from './heros-list/heros-list.component';
import { RouterModule } from '@angular/router';
@NgModule({
  declarations: [
    AppComponent,
    CrisisListComponent,
    HerosListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
   
    RouterModule.forRoot([
      {path : 'crisis-list', component : CrisisListComponent},
    {path : 'heros-list', component:HerosListComponent}]),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
