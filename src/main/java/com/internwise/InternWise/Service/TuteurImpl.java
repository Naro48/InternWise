package com.internwise.InternWise.Service;

import com.internwise.InternWise.Entities.TuteurEntity;
import com.internwise.InternWise.Exceptions.EntityNotFoundException;
import com.internwise.InternWise.Repositories.TuteurRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TuteurImpl implements TuteurInt {

    private final TuteurRepo tuteurRepo;

    public TuteurImpl(TuteurRepo tuteurRepo) {
        this.tuteurRepo = tuteurRepo;
    }


    @Override
    public TuteurEntity findById(int id) {
        return tuteurRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Tuteur Introuvable"));
    }

    @Override
    public void deleteById(int id) {
        tuteurRepo.deleteById(id);
    }

    /*@Override
    public List<TuteurEntity> searchByName(String name) {
        return tuteurRepo.searchByName(name);
    }*/
}
