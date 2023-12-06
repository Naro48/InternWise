package com.internwise.InternWise.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Etudiant")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtudiantEntity implements Serializable {

    @Id
    @Column(name = "numEtudiant")
    private Integer numEtudiant;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "adresse")
    private String adresse;

    @Column(name = "sexe")
    private String sexe;

    @Column(name = "date_naissance")
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Column(name = "Tel")
    private String numeroTel;

    @Column(name = "mention", nullable = false)
    private String mention;

    @Column(name = "AnneePromo", nullable = false)
    private Integer anneePromo;

    @ManyToOne
    @JoinColumn(name = "AnneePromo", referencedColumnName = "AnneePromo", insertable = false, updatable = false)
    private PromotionEntity promotion;
}
