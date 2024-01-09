package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.ProfEntity;
import com.internwise.InternWise.Entities.PromotionEntity;
import com.internwise.InternWise.Repositories.ProfRepo;
import org.springframework.stereotype.Service;

@Service
public class ProfImpl implements ProfInt{

    private final ProfRepo profRepo;

    public ProfImpl(ProfRepo profRepo) {
        this.profRepo = profRepo;
    }

    @Override
    public ProfEntity findById(int id) {
        return profRepo.findById(id);
    }

    @Override
    public ProfEntity addProf(ProfEntity prof) {
        return profRepo.save(prof);
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


}
