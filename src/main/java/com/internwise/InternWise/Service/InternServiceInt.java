package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.InternEntity;
import com.internwise.InternWise.dto.InternDto;

import java.util.List;

public interface InternServiceInt {

    public InternEntity createIntern(InternDto internDto);

    public InternEntity modifyIntern(InternDto internModified);

    public void deleteIntern(int id);

    public InternEntity findById(int id);

    public List<InternEntity> findByYear(int year);









}
