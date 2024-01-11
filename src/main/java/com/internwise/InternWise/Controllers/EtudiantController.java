package com.internwise.InternWise.Controllers;

import com.internwise.InternWise.Entities.EtudiantEntity;
import com.internwise.InternWise.Service.EtudiantImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiant")
public class EtudiantController {

    private final EtudiantImpl etudiantService;

    public EtudiantController(EtudiantImpl etudiantService) {
        this.etudiantService = etudiantService;
    }


    @PostMapping("/create")
    public ResponseEntity<EtudiantEntity> createEtudiant(@RequestBody EtudiantEntity etudiantEntity) {
        EtudiantEntity newEtudiant = etudiantService.createEtudiant(etudiantEntity);
        return new ResponseEntity<>(newEtudiant, HttpStatus.CREATED);
    }

    @PutMapping("/modify")
    public ResponseEntity<EtudiantEntity> modifyEtudiant(@RequestBody EtudiantEntity modifiedEtudiant) {
        EtudiantEntity updatedEtudiant = etudiantService.modifyEtudiant(modifiedEtudiant);
        return new ResponseEntity<>(updatedEtudiant, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<EtudiantEntity> getEtudiantById(@PathVariable("id") int id) {
        EtudiantEntity etudiantEntity = etudiantService.findById(id);
        return new ResponseEntity<>(etudiantEntity, HttpStatus.OK);
    }

    @GetMapping("/GetYear/{anneePromo}")
    public ResponseEntity<List<EtudiantEntity>> getEtudiantByAnneePromo(@PathVariable("anneePromo") int anneePromo) {
        List<EtudiantEntity> etudiants = etudiantService.findByAnneePromo(anneePromo);
        return new ResponseEntity<>(etudiants, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEtudiantById(@PathVariable("id") int id) {
        etudiantService.deleteEtudiantById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
