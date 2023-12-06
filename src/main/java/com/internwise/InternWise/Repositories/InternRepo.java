package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.InternEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InternRepo extends JpaRepository<InternEntity,Integer> {

    public InternEntity findById();

    public InternEntity findByYear();

    public List<InternEntity> findAllByStatutStage();








}
