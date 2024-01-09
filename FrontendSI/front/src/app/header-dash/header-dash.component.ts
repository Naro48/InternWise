import { Component } from '@angular/core';
import { TokenStorageService } from '../service/auth-storage.service';
import { Token } from '@angular/compiler';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header-dash',
  templateUrl: './header-dash.component.html',
  styleUrls: ['./header-dash.component.css']
})
export class HeaderDashComponent {
    
    imagePath : string;

    imagePatho : string; 
    token : TokenStorageService;
  
    constructor(token : TokenStorageService){
      this.imagePath = "../assets/logo_2.png";
      this.token = token;
      this.imagePatho = "../assets/titre_46809134.png"

    }
    ngOnInit(): void{

    }

    onSubmit(){
      this.token.signOut();
      
    }
}