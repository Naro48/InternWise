package com.internwise.InternWise.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.util.Date;
@Data
public class EtudiantDto {
    private String nom;

    private String prenom;

    private String adresse;

    private String sexe;

    private Date dateNaissance;

    private String numeroTel;

    private String mention;

    private Integer anneePromo;

}
