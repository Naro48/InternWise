package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.TypeStageEntity;

public interface TypeStageInt {

    public TypeStageEntity findByCode(int code);

    public Integer getNbrSemaines(Integer code);





}
