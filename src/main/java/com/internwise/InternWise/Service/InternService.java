package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.InternEntity;
import com.internwise.InternWise.Repositories.InternRepo;
import org.springframework.stereotype.Service;

@Service
public class InternService {

    private final InternRepo internRepo;


    public InternService(InternRepo internRepo) {
        this.internRepo = internRepo;
    }

    public InternEntity createIntern(InternEntity intern){
        InternEntity createdIntern = null;



        return internRepo.save(createdIntern);
    }


}
