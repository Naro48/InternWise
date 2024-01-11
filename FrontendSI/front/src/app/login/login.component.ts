import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Router } from '@angular/router';
import { AppConfig } from '../config';
import { TokenStorageService } from '../service/auth-storage.service';
import { Token } from '@angular/compiler';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
    email: string = "";
    password:string = "";
    tokenStorage: TokenStorageService;

    constructor(private http: HttpClient,private router: Router,tokenStorage: TokenStorageService){
      this.tokenStorage = tokenStorage;
    }


    
    onSubmit(){


      const Url = AppConfig.apiUrl;
      const endpoint = `${Url}/auth/login`;
    
      
      const data = {
        email: this.email,
        password: this.password
      };

      this.http.post(endpoint,data).subscribe(
        (response:any) => {
          const token = response.token;
          this.tokenStorage.saveToken(token);

          
          this.router.navigate(['/dashboard']);
        },
        (error) => {
          console.error("Erreur lors de l\'authentification",error);
        }
      )

    }




  }
