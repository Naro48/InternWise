package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.EntrepriseEntity;
import com.internwise.InternWise.dto.EntrepriseDto;

public interface EntrepriseInt {
    public EntrepriseEntity addEntreprise(EntrepriseDto ent);

    public EntrepriseEntity updateEntreprise(EntrepriseEntity modifiedEnt , int id);

    public void deleteById(int id);

    public EntrepriseEntity findById(int id);








}
