package com.internwise.InternWise.Controllers;

import com.internwise.InternWise.Entities.EtudiantEntity;
import com.internwise.InternWise.Service.EtudiantImpl;
import com.internwise.InternWise.dto.EtudiantDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiant")
@CrossOrigin("http://localhost:4200/")
public class EtudiantController {

    private final EtudiantImpl etudiantService;

    public EtudiantController(EtudiantImpl etudiantService) {
        this.etudiantService = etudiantService;
    }


    @PostMapping("/create")
    public ResponseEntity<EtudiantEntity> createEtudiant(@RequestBody EtudiantDto etudiantDto) {
        EtudiantEntity newEtudiant = etudiantService.createEtudiant(etudiantDto);
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

    @GetMapping("/all")
    public ResponseEntity<List<EtudiantEntity>> findAll(){
        return new ResponseEntity<>(etudiantService.findAll(),HttpStatus.OK);
    }
 }
