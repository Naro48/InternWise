package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.EtudiantEntity;
import com.internwise.InternWise.Entities.InternEntity;
import com.internwise.InternWise.Repositories.InternRepo;
import com.internwise.InternWise.dto.InternDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternService implements InternServiceInt{

    private final InternRepo internRepo;


    public InternService(InternRepo internRepo) {
        this.internRepo = internRepo;
    }

    public InternEntity createIntern(InternEntity intern){
        InternEntity createdIntern = new InternEntity();

        createdIntern.setYear(intern.getYear());
        createdIntern.setDateDebut(intern.getDateDebut());
        createdIntern.setDateFin(intern.getDateFin());




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

    @Override
    public InternEntity findById(int id) {
        return null;
    }

    @Override
    public List<InternEntity> findByYear(int year) {
        return null;
    }

    @Override
    public List<InternEntity> findByEtudiant(EtudiantEntity etudiant) {
        return null;
    }

    @Override
    public List<InternEntity> findByEtudiantAndYear(EtudiantEntity etudiant, int year) {
        return null;
    }
}
