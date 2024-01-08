package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.TypeStageEntity;
import com.internwise.InternWise.Repositories.TypeStageRepo;

public class TypeStageImpl implements TypeStageInt{

    private final TypeStageRepo typeStageRepo;
    TypeStageEntity type11 = new TypeStageEntity(11,4);
    TypeStageEntity type21 = new TypeStageEntity(21,4);
    TypeStageEntity type22 = new TypeStageEntity(22,8);
    TypeStageEntity type31 = new TypeStageEntity(31,2);
    TypeStageEntity type32 = new TypeStageEntity(32,12);

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
