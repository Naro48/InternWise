package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.PromotionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<PromotionEntity,Integer> {
}
