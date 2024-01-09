package com.internwise.InternWise.Entities;

import com.internwise.InternWise.StatutStage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "stage")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numStage")
    private int id;

    @Column(nullable = false, name = "AnneeStage")
    private Integer year;

    @Column(nullable = false, name = "DateDebutStage")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    @Column(nullable = false, name = "DateFinStage")
    @Temporal(TemporalType.DATE)
    private Date dateFin;


    @Column(nullable = false, name = "StatutSTage")
    @Enumerated(EnumType.STRING)
    private StatutStage statutStage;

    @Column(name = "compteRendu")
    private String compteRendu;

    @ManyToOne
    @JoinColumn(name = "numTuteur")
    private TuteurEntity tuteur;

    @ManyToOne
    @JoinColumn(name = "numEtudiant")
    private EtudiantEntity etudiant;

    @ManyToOne
    @JoinColumn(name = "numEntreprise")
    private EntrepriseEntity entreprise;

    @ManyToOne
    @JoinColumn(name = "numProf")
    private ProfEntity professeur;

    @ManyToOne
    @JoinColumn(name = "codeTypeStage", nullable = false)
    private TypeStageEntity typeStage;

}
