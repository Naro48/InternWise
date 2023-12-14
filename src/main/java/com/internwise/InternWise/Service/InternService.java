package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.InternEntity;
import com.internwise.InternWise.Repositories.InternRepo;
import com.internwise.InternWise.dto.InternDto;
import org.springframework.stereotype.Service;

@Service
public class InternService implements InternServiceInt{

    private final InternRepo internRepo;


    public InternService(InternRepo internRepo) {
        this.internRepo = internRepo;
    }

    public InternEntity createIntern(InternEntity intern){
        InternEntity createdIntern = null;



        return internRepo.save(createdIntern);
    }


    @Override
    public InternEntity createIntern(InternDto internDto) {
        return null;
    }

    @Override
    public InternEntity modifyIntern(InternDto internModified) {
        return null;
    }

    @Override
    public void deleteIntern(int id) {

    }
}
