package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.EntrepriseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepo extends JpaRepository<EntrepriseEntity,Integer> {
    public EntrepriseEntity findById(int id);

    public EntrepriseEntity deleteById(int id);



}
