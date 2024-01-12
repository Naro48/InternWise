import { Component, OnInit } from '@angular/core';
import { faAdd } from '@fortawesome/free-solid-svg-icons';
import { StageService } from '../service/stage.service';
import { ActivatedRoute, Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Stage1 } from '../interface/stage1';
import { Entreprise } from '../interface/entreprise';

@Component({
  selector: 'app-add-stage-form',
  templateUrl: './add-stage-form.component.html',
  styleUrls: ['./add-stage-form.component.css']
})
export class AddStageFormComponent implements OnInit{

  faAdd = faAdd;

  isEditMode : boolean = false;

  stageToUpdate:any;

  // Properties from the interface
  id: number =0;
  year: number =2024;
  dateDebut: Date = new Date();
  dateFin: Date=new Date();
  statutStage: string="";
  compteRendu: string="";

  codeTypeStageString: string ="";
  codeTypeStage : number = 0; 
  etudiant: number =0;
  professeur: number =0;

  nomEntreprise: string ="";
  raisonSociale : string ="";
  formeJuridique :string ="";
  adresseEntreprise: string ="";
  numTelStandard: string ="";

  tuteur: string = "";
  telTuteur: string="";

  stageID: any;

  constructor(private stageService : StageService ,
    private router: Router,
    private http : HttpClient,
    private route:ActivatedRoute){}

    ngOnInit(): void {
      this.route.queryParams.subscribe(params =>
        {
          this.stageID = params['stageID'];
          this.isEditMode = !!this.stageID;})
  
          if (this.isEditMode) {
            this.loadStage();
  
          }
    }

  loadStage() {
    this.stageService.getStageByID(this.stageID).subscribe(
      (stage: Stage1) => {
        this.stageToUpdate = stage;
        console.log(stage);
      },
      (error) => {
        console.error('Error loading student details:', error);
      }
    );
  }  
 
  ;


  onSubmit() {

    this.codeTypeStage = parseInt(this.codeTypeStageString);

    const stageData: Stage1 = {
      id: this.id,
      year: this.year,
      dateDebut: this.dateDebut,
      dateFin: this.dateFin,
      statutStage: this.statutStage,
      compteRendu: this.compteRendu,
      codeTypeStage: this.codeTypeStage,
      etudiant: this.etudiant,
      prof: this.professeur,
      tuteur: this.tuteur,
      telTuteur: this.telTuteur,
      nomEntreprise: this.nomEntreprise,
      raisonSociale: this.raisonSociale,
      formeJuridique: this.formeJuridique,
      adresseEntreprise: this.adresseEntreprise,
      numTelStandard: this.numTelStandard
    }
    
  
    // Assuming you have a service called stageService with addStage and updateStage methods
    if (!this.isEditMode) {
      this.stageService.addStage(stageData).subscribe(
        (createdStage) => {
          console.log("New stage created: ", createdStage);
          // Additional logic if needed
        },
        (error) => {
          console.error('Error creating stage: ', error);
        }
      );
    } else {
      this.stageService.updateStage(stageData).subscribe(
        (updatedStage) => {
          console.log(stageData);
          console.log("Stage Updated");
          // Additional logic if needed
        },
        (error) => {
          console.error("Error updating stage:", error);
        }
      );
    }
  }
  
  
}
