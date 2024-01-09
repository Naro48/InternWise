import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
    ImagePath :string;

    constructor(){
      this.ImagePath = "../assets/logo.png"
    }

    ngOnInit(){
      
    }
}
