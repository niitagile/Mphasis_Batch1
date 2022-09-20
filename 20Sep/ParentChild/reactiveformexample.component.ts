import { Component, OnInit } from '@angular/core';

import {FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactiveformexample',
  templateUrl: './reactiveformexample.component.html',
  styleUrls: ['./reactiveformexample.component.css']
})
export class ReactiveformexampleComponent implements OnInit {

  
  constructor(private formBuilder: FormBuilder) { }
  title = 'angCare';
 
//  name = '';
  submitted = false;
 registerForm: FormGroup=new FormGroup({});
/*  ontyping(event:Event) {
     
    this.name = (<HTMLInputElement>event.target).value;
    console.log(this.name);
  }
  */
  
     
  ngOnInit() {
    this.registerForm = this.formBuilder.group({
        firstName: ['', Validators.required],
        lastName: ['', Validators.required],
        email: ['', [Validators.required, Validators.email]],
        password: ['', [Validators.required, Validators.minLength(6)]]
    });
  }
     
  get f() { return this.registerForm.controls; }
     
  onSubmit() {
    this.submitted = true;
     
    // stop here if form is invalid
    if (this.registerForm.invalid) {
        return;
    }
     
    alert('Your request has been submitted for approval')
  }
}


