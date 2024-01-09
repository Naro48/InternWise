package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.TuteurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TuteurRepo extends JpaRepository<TuteurEntity, Integer> {

    @Query("SELECT p FROM Tuteur p WHERE p.Nom LIKE %:name%")
    List<TuteurEntity> searchByName(@Param("name") String name);






}
