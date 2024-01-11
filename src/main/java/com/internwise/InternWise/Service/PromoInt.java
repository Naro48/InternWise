package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.PromotionEntity;

import java.util.Optional;

public interface PromoInt {

    Optional<PromotionEntity> findByAnneePromo(Integer AnnneePromo);

    PromotionEntity updateNbrRecus(int anneePromo);

    PromotionEntity updateNbrInscris(int anneePromo);
}
