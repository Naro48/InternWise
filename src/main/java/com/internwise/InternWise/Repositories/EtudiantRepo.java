package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.EtudiantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EtudiantRepo extends JpaRepository<EtudiantEntity,Integer> {

    public EtudiantEntity findById(int id );

    public List<EtudiantEntity> findByAnneePromo(int anneePromo);

    public void deleteById(int id);






}
