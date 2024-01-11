package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.PromotionEntity;
import com.internwise.InternWise.Repositories.PromotionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PromoService implements PromoInt{

    private final PromotionRepository promotionRepository ;

    public PromoService(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }


    @Override
    public Optional<PromotionEntity> findByAnneePromo(Integer anneePromo) {
        return promotionRepository.findByAnneePromo(anneePromo);
    }

    @Override
    public PromotionEntity updateNbrRecus(int anneePromo) {
        return null;
    }

    @Override
    public PromotionEntity updateNbrInscris(int anneePromo) {
        PromotionEntity promo = promotionRepository.findByAnneePromo(anneePromo).orElseThrow(() -> new RuntimeException("Promo introuvable"));
        String nbr = String.valueOf(Integer.valueOf(promo.getNombreInscrits()) + 1);
        promo.setNombreInscrits(nbr);
        return promotionRepository.save(promo);
    }


}
