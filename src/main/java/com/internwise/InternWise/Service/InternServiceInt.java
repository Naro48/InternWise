package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.EtudiantEntity;
import com.internwise.InternWise.Entities.InternEntity;
import com.internwise.InternWise.dto.InternDto;

import java.util.List;

public interface InternServiceInt {

    public InternEntity createIntern(InternDto intern);

    public InternEntity modifyIntern(InternEntity internModified,int id);

    public void deleteIntern(int id);

    public InternEntity findById(int id);

    public List<InternEntity> findByYear(int year);

    public List<InternEntity> findByEtudiant(EtudiantEntity etudiant);

    public List<InternEntity> findByEtudiantAndYear(EtudiantEntity etudiant,int year);

    public void endIntern(int id);

    public void startIntern(int id);

    public List<InternEntity> findAll();










}
