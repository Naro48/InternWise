package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.ProfEntity;
import com.internwise.InternWise.Entities.PromotionEntity;

public interface ProfInt {
    public ProfEntity findById(int id);

    public ProfEntity addProf(ProfEntity prof);

    public ProfEntity updateProf(ProfEntity prof);

    public void deleteProf(int id);

    public ProfEntity findByPromotion(PromotionEntity promotion);




}
