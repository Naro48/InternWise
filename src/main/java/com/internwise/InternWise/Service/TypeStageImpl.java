package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.TypeStageEntity;
import com.internwise.InternWise.Repositories.TypeStageRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeStageImpl implements TypeStageInt{

    private final TypeStageRepo typeStageRepo;

    public TypeStageImpl(TypeStageRepo typeStageRepo) {
        this.typeStageRepo = typeStageRepo;
    }

    @Override
    public TypeStageEntity findByCode(int code) {
        return typeStageRepo.findByCodeTypeStage(code);
    }

    @Override
    public Integer getNbrSemaines(Integer code) {
        TypeStageEntity typeStage = typeStageRepo.findByCodeTypeStage(code);

        return typeStage.getNbrSemaines();
    }


}
