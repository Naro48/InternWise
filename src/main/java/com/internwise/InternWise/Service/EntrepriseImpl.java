package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.EntrepriseEntity;
import com.internwise.InternWise.Repositories.EntrepriseRepo;

public class EntrepriseImpl implements EntrepriseInt{


    private final EntrepriseRepo entrepriseRepo;

    public EntrepriseImpl(EntrepriseRepo entrepriseRepo) {
        this.entrepriseRepo = entrepriseRepo;
    }

    @Override
    public EntrepriseEntity addEntreprise(EntrepriseEntity ent) {
        return entrepriseRepo.save(ent);
    }

    @Override
    public EntrepriseEntity updateEntreprise(EntrepriseEntity ent) {
        return entrepriseRepo.save(ent);
    }

    @Override
    public void deleteById(int id) {
        entrepriseRepo.deleteById(id);
    }

    @Override
    public EntrepriseEntity findById(int id) {
        return entrepriseRepo.findById(id);
    }
}
