package com.internwise.InternWise.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternDto implements Serializable{

    private Integer year;
    private Date dateDebut;
    private Date dateFin;
    private String statutStage;
    private String compteRendu;
    private int codeTypeStage;
    private int etudiant;
    private int prof;
    private String tuteur;
    private String telTuteur;
    private String nomEntreprise;
    private String raisonSociale;
    private String formeJuridique;
    private String adresseEntreprise;
    private String numTelStandard;


}
