package com.internwise.InternWise.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "Entreprise")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntrepriseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numEntreprise")
    private Integer numEntreprise;

    @Column(name = "nomEntreprise")
    private String nomEntreprise;

    @Column(name = "RaisonSociale")
    private String raisonSociale;

    @Column(name = "formeJuridique", nullable = false)
    private String formeJuridique;

    @Column(name = "adresseEntreprise", nullable = false)
    private String adresseEntreprise;

    @Column(name = "numTelStandard", nullable = false)
    private String numTelStandard;
}
