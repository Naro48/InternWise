package com.internwise.InternWise.dto;

import com.internwise.InternWise.Entities.PromotionEntity;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;
@Data
public class ProfDto {

    private String prenom;

    private String nom;

    private String adresse;

    private char sexe;

    private Date dateEmbauche;

    private Date dateDepart;

    private String telephonePersonnel;

    private String telephoneInstitutionnel;

    private int promotion;
}
