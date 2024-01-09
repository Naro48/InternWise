package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.EntrepriseEntity;

public interface EntrepriseInt {
    public EntrepriseEntity addEntreprise(EntrepriseEntity ent);

    public EntrepriseEntity updateEntreprise(EntrepriseEntity modifiedEnt , int id);

    public void deleteById(int id);

    public EntrepriseEntity findById(int id);








}
