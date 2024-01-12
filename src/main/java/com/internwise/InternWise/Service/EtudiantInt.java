package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.EtudiantEntity;
import com.internwise.InternWise.dto.EtudiantDto;

import java.util.List;

public interface EtudiantInt {

    public EtudiantEntity createEtudiant(EtudiantDto etudiant);

    public EtudiantEntity modifyEtudiant(EtudiantEntity modifiedEtudiant);

    public EtudiantEntity findById(int id);

    public List<EtudiantEntity>  findByAnneePromo(int anneePromo);

    public void deleteEtudiantById(int id);

    public List<EtudiantEntity> findAll();

    public List<EtudiantEntity> searchByName(String nom);


}
