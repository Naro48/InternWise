package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.EntrepriseEntity;
import com.internwise.InternWise.Entities.EtudiantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EntrepriseRepo extends JpaRepository<EntrepriseEntity,Integer> {
    public EntrepriseEntity findById(int id);

    public EntrepriseEntity deleteById(int id);





}
