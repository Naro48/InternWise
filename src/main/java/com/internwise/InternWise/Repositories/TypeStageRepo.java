package com.internwise.InternWise.Repositories;

import com.internwise.InternWise.Entities.TypeStageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeStageRepo extends JpaRepository<TypeStageEntity,Integer> {
    public TypeStageEntity findByCodeTypeStage(Integer codeTypeStage);

    public Integer getNbrSemaines(TypeStageEntity typeStage);

}
