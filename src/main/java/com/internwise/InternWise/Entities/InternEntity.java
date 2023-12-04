package com.internwise.InternWise.Entities;

import com.internwise.InternWise.StatutStage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "stage")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternEntity implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false , name = "Année Stage")
    private Integer year;

    @Column(nullable = false, name = "Date de debut")
    private Date dateDebut;

    @Column(nullable = false, name = "Date de fin")
    private Date dateFin;

    @Column(nullable = false, name = "Statut")
    private StatutStage statutStage;
    
    private String compteRendu;





}
