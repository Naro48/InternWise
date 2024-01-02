package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.EtudiantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepo extends JpaRepository<EtudiantEntity,Integer> {

    public EtudiantEntity findById(int id );



}
