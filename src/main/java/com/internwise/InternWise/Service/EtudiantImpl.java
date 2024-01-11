package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.EtudiantEntity;
import com.internwise.InternWise.Repositories.EtudiantRepo;
import com.internwise.InternWise.Repositories.PromotionRepository;
import com.internwise.InternWise.dto.EtudiantDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EtudiantImpl implements EtudiantInt{

    private final EtudiantRepo etudiantRepo;

    private final PromotionRepository promotionRepository;

    private final PromoService promoService;

    public EtudiantImpl(EtudiantRepo etudiantRepo, PromotionRepository promotionRepository, PromoService promoService) {
        this.etudiantRepo = etudiantRepo;
        this.promotionRepository = promotionRepository;
        this.promoService = promoService;
    }

    @Override
    public EtudiantEntity createEtudiant(EtudiantDto et) {
        EtudiantEntity etudiant = new EtudiantEntity();

        etudiant.setAdresse(et.getAdresse());
        etudiant.setNom(et.getNom());
        etudiant.setPrenom(et.getPrenom());
        etudiant.setSexe(et.getSexe());
        etudiant.setDateNaissance(et.getDateNaissance());
        etudiant.setNumeroTel(et.getNumeroTel());
        etudiant.setMention("N/A");

        etudiant.setPromotion(promotionRepository.findById(et.getAnneePromo()).orElseThrow(() -> new RuntimeException("Promo Introuvable")));
        etudiant.setAnneePromo(et.getAnneePromo());

        promoService.updateNbrInscris(et.getAnneePromo());


        return etudiantRepo.save(etudiant);
    }

    @Override
    public EtudiantEntity modifyEtudiant(EtudiantEntity modifiedEtudiant) {
        return etudiantRepo.save(modifiedEtudiant);
    }

    @Override
    public EtudiantEntity findById(int id) {
        return etudiantRepo.findById(id);
    }

    @Override
    public List<EtudiantEntity> findByAnneePromo(int anneePromo) {
        return etudiantRepo.findByAnneePromo(anneePromo);
    }

    @Override
    public void deleteEtudiantById(int id) {
        etudiantRepo.deleteById(id);
    }

    @Override
    public List<EtudiantEntity> findAll() {
        return etudiantRepo.findAll();
    }


}
