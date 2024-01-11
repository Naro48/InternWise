package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.PromotionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PromotionRepository extends JpaRepository<PromotionEntity,Integer> {
    Optional<PromotionEntity> findByAnneePromo(Integer anneePromo);


}
