package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.EntrepriseEntity;
import com.internwise.InternWise.Repositories.EntrepriseRepo;
import com.internwise.InternWise.dto.EntrepriseDto;
import org.springframework.stereotype.Service;

@Service
public class EntrepriseImpl implements EntrepriseInt{


    private final EntrepriseRepo entrepriseRepo;

    public EntrepriseImpl(EntrepriseRepo entrepriseRepo) {
        this.entrepriseRepo = entrepriseRepo;
    }

    @Override
    public EntrepriseEntity addEntreprise(EntrepriseDto ent) {
        EntrepriseEntity entreprise = new EntrepriseEntity();
        entreprise.setNomEntreprise(ent.getNomEntreprise());
        entreprise.setAdresseEntreprise(ent.getAdresseEntreprise());
        entreprise.setFormeJuridique(ent.getFormeJuridique());
        entreprise.setNumTelStandard(ent.getNumTelStandard());
        entreprise.setRaisonSociale(ent.getRaisonSociale());

        return entrepriseRepo.save(entreprise);
    }

    @Override
    public EntrepriseEntity updateEntreprise(EntrepriseEntity modifiedEnt, int id) {
        EntrepriseEntity ent = entrepriseRepo.findById(id);
        ent.setAdresseEntreprise(modifiedEnt.getAdresseEntreprise());
        ent.setNomEntreprise(modifiedEnt.getNomEntreprise());
        ent.setFormeJuridique(modifiedEnt.getFormeJuridique());
        ent.setRaisonSociale(modifiedEnt.getFormeJuridique());
        ent.setNumTelStandard(modifiedEnt.getNumTelStandard());
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
