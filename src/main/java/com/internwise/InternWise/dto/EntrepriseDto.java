package com.internwise.InternWise.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class EntrepriseDto {
    private String nomEntreprise;

    private String raisonSociale;

    private String formeJuridique;

    private String adresseEntreprise;

    private String numTelStandard;
}
