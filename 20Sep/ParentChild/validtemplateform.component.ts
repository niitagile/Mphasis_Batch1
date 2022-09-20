import { Component, ViewChild, ElementRef, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-validtemplateform',
  templateUrl: './validtemplateform.component.html',
  styleUrls: ['./validtemplateform.component.css']
})
export class ValidtemplateformComponent implements OnInit {
  
 
  constructor() { }
  ngOnInit(): void {
    
  }
  submit(form:any){
    var firstName = form.firstName;
    console.log(firstName);
  
    var lastName = form.lastName;
    console.log(lastName);
  
    var comment = form.comment;
    console.log(comment);
  }
}