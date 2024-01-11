package com.internwise.InternWise.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Professeur")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "numProf")
    private int numProf;

    @Column(name = "Prenom")
    private String prenom;

    @Column(name = "Nom")
    private String nom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "Sexe")
    private char sexe;

    @Column(name = "DateEmbauche")
    private Date dateEmbauche;

    @Column(name = "DateDepart", nullable = true)
    private Date dateDepart;

    @Column(name = "TelephonePersonnel", nullable = false)
    private String telephonePersonnel;

    @Column(name = "TelephoneInstitutionnel", nullable = false)
    private String telephoneInstitutionnel;

    @ManyToOne
    @JoinColumn(name = "AnneePromo", referencedColumnName = "AnneePromo")
    private PromotionEntity promotion;
}
