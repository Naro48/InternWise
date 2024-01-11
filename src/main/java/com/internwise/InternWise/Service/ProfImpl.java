package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.ProfEntity;
import com.internwise.InternWise.Entities.PromotionEntity;
import com.internwise.InternWise.Repositories.ProfRepo;
import com.internwise.InternWise.Repositories.PromotionRepository;
import com.internwise.InternWise.dto.ProfDto;
import jakarta.persistence.Column;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfImpl implements ProfInt{

    private final ProfRepo profRepo;

    private final PromotionRepository promotionRepository;

    public ProfImpl(ProfRepo profRepo, PromotionRepository promotionRepository) {
        this.profRepo = profRepo;
        this.promotionRepository = promotionRepository;
    }

    @Override
    public ProfEntity findById(int id) {
        return profRepo.findById(id);
    }

    @Override
    public ProfEntity addProf(ProfDto prof) {
        ProfEntity pr = new ProfEntity();

        pr.setNom(prof.getNom());
        pr.setPrenom(prof.getPrenom());
        pr.setAdresse(prof.getAdresse());
        pr.setSexe(prof.getSexe());
        pr.setTelephoneInstitutionnel(prof.getTelephoneInstitutionnel());
        pr.setTelephonePersonnel(prof.getTelephonePersonnel());
        pr.setDateEmbauche(prof.getDateEmbauche());
        pr.setPromotion(promotionRepository.findById(prof.getPromotion()).orElseThrow(() -> new RuntimeException("Promotion Introuvable")));
        return profRepo.save(pr);
    }

    @Override
    public ProfEntity updateProf(ProfEntity modifiedProf, int id) {
        ProfEntity prof = profRepo.findById(id);
        return profRepo.save(prof);
    }

    @Override
    public void deleteProf(int id) {
        profRepo.deleteById(id);
    }

    @Override
    public ProfEntity findByPromotion(PromotionEntity promotion) {
        return profRepo.findByPromotion(promotion);
    }

    public List<ProfEntity> findAll(){
        return profRepo.findAll() ;
    }


}
