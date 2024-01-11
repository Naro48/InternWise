package com.internwise.InternWise.Controllers;

import com.internwise.InternWise.Entities.EntrepriseEntity;
import com.internwise.InternWise.Service.EntrepriseImpl;
import com.internwise.InternWise.dto.EntrepriseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entreprise")
public class EntrepriseController {

    private final EntrepriseImpl entrepriseService;

    public EntrepriseController(EntrepriseImpl entrepriseService) {
        this.entrepriseService = entrepriseService;
    }

    @PostMapping("/add")
    public ResponseEntity<EntrepriseEntity> addEntreprise(@RequestBody EntrepriseDto entrepriseEntity) {
        EntrepriseEntity newEntreprise = entrepriseService.addEntreprise(entrepriseEntity);
        return new ResponseEntity<>(newEntreprise, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EntrepriseEntity> updateEntreprise(
            @RequestBody EntrepriseEntity modifiedEnt,
            @PathVariable("id") int id) {
        EntrepriseEntity updatedEntreprise = entrepriseService.updateEntreprise(modifiedEnt, id);
        return new ResponseEntity<>(updatedEntreprise, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEntreprise(@PathVariable("id") int id) {
        entrepriseService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<EntrepriseEntity> getEntrepriseById(@PathVariable("id") int id) {
        EntrepriseEntity entrepriseEntity = entrepriseService.findById(id);
        return new ResponseEntity<>(entrepriseEntity, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<EntrepriseEntity>> findAll(){
        return new ResponseEntity<>(entrepriseService.findAll(),HttpStatus.OK);
    }
}
