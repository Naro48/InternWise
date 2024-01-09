package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.TuteurEntity;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TuteurInt {

    public TuteurEntity findById(int id);

    public void deleteById(int id);

    public List<TuteurEntity> searchByName(String name );
}
