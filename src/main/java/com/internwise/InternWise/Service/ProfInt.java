package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.ProfEntity;
import com.internwise.InternWise.Entities.PromotionEntity;
import com.internwise.InternWise.dto.ProfDto;

import java.util.List;

public interface ProfInt {
    public ProfEntity findById(int id);

    public ProfEntity addProf(ProfDto prof);

    public ProfEntity updateProf(ProfEntity prof, int id);

    public void deleteProf(int id);

    public ProfEntity findByPromotion(PromotionEntity promotion);

    public List<ProfEntity> findAll();




}
