package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.TypeStageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeStageRepo extends JpaRepository<TypeStageEntity,Integer> {
    public TypeStageEntity findByCodeTypeStage(Integer codeTypeStage);

    public List<TypeStageEntity> findAll();

}
