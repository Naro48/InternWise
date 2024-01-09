package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.EtudiantEntity;
import com.internwise.InternWise.Entities.InternEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InternRepo extends JpaRepository<InternEntity,Integer> {

    public InternEntity findById(int id);

    public List<InternEntity> findByYear(int year);

    public List<InternEntity> findByEtudiant(EtudiantEntity etudiant);

    public List<InternEntity> findByEtudiantAndYear(EtudiantEntity etudiant,int year);

    public List<InternEntity> findByStatutStage(String statut);






}
