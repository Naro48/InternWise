package com.internwise.InternWise.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Compose")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComposeEntity implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "numCompetence", referencedColumnName = "numCompetence")
    private CompetenceEntity competence;

    @Id
    @ManyToOne
    @JoinColumn(name = "codeTypeStage", referencedColumnName = "codeTypeStage")
    private TypeStageEntity typeStage;

    @Column(name = "niveauExige", nullable = false)
    private String niveauExige;
}
