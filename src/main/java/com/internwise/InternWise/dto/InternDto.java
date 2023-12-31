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

    private int id;
    private Integer year;
    private Date dateDebut;
    private Date dateFin;
    private String statutStage;
    private String compteRendu;
    private int numTuteur;
    private int numEtudiant;
    private int numEntreprise;
    private int numProf;
    private int codeTypeStage;

}
