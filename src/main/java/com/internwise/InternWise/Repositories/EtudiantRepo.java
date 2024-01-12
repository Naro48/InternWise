package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.EtudiantEntity;
import com.internwise.InternWise.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EtudiantRepo extends JpaRepository<EtudiantEntity,Integer> {

    public EtudiantEntity findById(int id );

    public List<EtudiantEntity> findByAnneePromo(int anneePromo);

    public void deleteById(int id);

    @Query("SELECT e FROM EtudiantEntity e WHERE e.nom LIKE %:nom%")
    List<EtudiantEntity> searchByName(@Param("nom") String nom);




}
