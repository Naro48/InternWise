package com.internwise.InternWise.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Tuteur")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TuteurEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numTuteur")
    private Integer numTuteur;

    @Column(name = "Prenom")
    private String prenom;

    @Column(name = "Nom")
    private String nom;

    @Column(name = "TelephonePersonnel", nullable = false)
    private String telephonePersonnel;
}
