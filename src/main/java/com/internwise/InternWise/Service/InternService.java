package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.EtudiantEntity;
import com.internwise.InternWise.Entities.InternEntity;
import com.internwise.InternWise.Repositories.InternRepo;
import com.internwise.InternWise.Repositories.TypeStageRepo;
import com.internwise.InternWise.StatutStage;
import com.internwise.InternWise.dto.InternDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternService implements InternServiceInt{

    private final InternRepo internRepo;
    private final TypeStageRepo typeStageRepo ;




    public InternService(InternRepo internRepo, TypeStageRepo typeStageRepo) {
        this.internRepo = internRepo;
        this.typeStageRepo = typeStageRepo;
    }

    public InternEntity createIntern(InternDto intern){
        InternEntity createdIntern = new InternEntity();

        createdIntern.setYear(intern.getYear());
        createdIntern.setDateDebut(intern.getDateDebut());
        createdIntern.setDateFin(intern.getDateFin());
        createdIntern.setTypeStage(typeStageRepo.findByCodeTypeStage(intern.getCodeTypeStage()) );
        createdIntern.setStatutStage(StatutStage.Avenir);

        return internRepo.save(createdIntern);
    }



    @Override
    public InternEntity modifyIntern(InternEntity internModified, int id) {
        InternEntity intern = internRepo.findById(id);

        intern.setYear(internModified.getYear());
        intern.setDateDebut(internModified.getDateDebut());
        intern.setDateFin(internModified.getDateFin());
        intern.setTuteur(internModified.getTuteur());
        intern.setProfesseur(internModified.getProfesseur());
        intern.setCompteRendu(internModified.getCompteRendu());
        intern.setTypeStage(internModified.getTypeStage());



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

    @Override
    public void endIntern(int id) {
        InternEntity intern = internRepo.findById(id);
        intern.setStatutStage(StatutStage.Termine);
    }

    @Override
    public void startIntern(int id) {
        InternEntity intern = internRepo.findById(id);
        intern.setStatutStage(StatutStage.Encours);
    }
}
