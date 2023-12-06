package com.internwise.InternWise.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Competence")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompetenceEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numCompetence")
    private Integer numCompetence;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "description", nullable = false)
    private String description;
}
