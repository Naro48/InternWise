package com.internwise.InternWise.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Promotion")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromotionEntity implements Serializable {

    @Id
    @Column(name = "AnneePromo")
    private Integer anneePromo;

    @Column(name = "nombreInscrits" , nullable = true)
    private String nombreInscrits;

    @Column(name = "nombreRecus" , nullable = true)
    private String nombreRecus;

    @Column(name = "numProf")
    private Integer numProf;

    @ManyToOne
    @JoinColumn(name = "numProf", referencedColumnName = "numProf", insertable = false,updatable = false)
    private ProfEntity professeur;
}
