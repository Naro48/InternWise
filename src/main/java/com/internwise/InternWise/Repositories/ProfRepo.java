package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.ProfEntity;
import com.internwise.InternWise.Entities.PromotionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfRepo extends JpaRepository<ProfEntity,Integer> {
    public ProfEntity findById(int id);

    public ProfEntity findByPromotion(PromotionEntity promotion);



}
