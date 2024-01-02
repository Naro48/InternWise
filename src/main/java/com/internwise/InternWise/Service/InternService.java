package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.EtudiantEntity;
import com.internwise.InternWise.Entities.InternEntity;
import com.internwise.InternWise.Exceptions.EntityNotFoundException;
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
        createdIntern.setProfesseur(intern.getProfesseur());
        createdIntern.setEntreprise(intern.getEntreprise());
        createdIntern.setTuteur(intern.getTuteur());
        createdIntern.setTypeStage(intern.getTypeStage());




        return internRepo.save(createdIntern);
    }



    @Override
    public InternEntity modifyIntern(InternEntity internModified) {
        return internRepo.save(internModified) ;
    }

    @Override
    public void deleteIntern(int id) {
         internRepo.deleteById(id);
    }

    @Override
    public InternEntity findById(int id) {
        return internRepo
                .findById(id);


    }

    @Override
    public List<InternEntity> findByYear(int year) {

        return internRepo.findByYear(year);
    }

    @Override
    public List<InternEntity> findByEtudiant(EtudiantEntity etudiant) {
        return internRepo.findByEtudiant(etudiant);
    }

    @Override
    public List<InternEntity> findByEtudiantAndYear(EtudiantEntity etudiant, int year) {
        return internRepo.findByEtudiantAndYear(etudiant,year);
    }
}
