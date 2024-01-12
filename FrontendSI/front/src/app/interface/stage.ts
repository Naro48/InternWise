import { Entreprise } from "./entreprise";
import { Prof } from "./prof";
import { Student } from "./student";
import { Tuteur } from "./tuteur";
import { TypeStage } from "./type-stage";

export interface Stage {
    id: number;
    year: number ,
    dateDebut: Date,
    dateFin: Date,
    statutStage: string,
    compteRendu: string,

    typeStage: TypeStage,
    etudiant: Student,
    professeur: Prof,
    entreprise: Entreprise,
    tuteur: Tuteur

}
