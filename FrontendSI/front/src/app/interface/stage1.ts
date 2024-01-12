import { Entreprise } from "./entreprise";
import { Prof } from "./prof";
import { Student } from "./student";
import { Tuteur } from "./tuteur";
import { TypeStage } from "./type-stage";

export interface Stage1 {
    id: number;
    year: number ,
    dateDebut: Date,
    dateFin: Date,
    statutStage: string,
    compteRendu: string,

    codeTypeStage: number,
    etudiant: number,
    prof: number,

    tuteur: string,
    telTuteur: string,

    nomEntreprise: string,
    raisonSociale: string,
    formeJuridique: string,
    adresseEntreprise:string,
    numTelStandard : string

}
