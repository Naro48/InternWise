package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.EtudiantEntity;
import com.internwise.InternWise.Repositories.EtudiantRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EtudiantImpl implements EtudiantInt{

    private final EtudiantRepo etudiantRepo;

    public EtudiantImpl(EtudiantRepo etudiantRepo) {
        this.etudiantRepo = etudiantRepo;
    }

    @Override
    public EtudiantEntity createEtudiant(EtudiantEntity etudiant) {
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
