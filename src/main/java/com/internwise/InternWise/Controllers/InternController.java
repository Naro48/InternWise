package com.internwise.InternWise.Controllers;

import com.internwise.InternWise.Entities.EtudiantEntity;
import com.internwise.InternWise.Entities.InternEntity;
import com.internwise.InternWise.Service.InternService;
import com.internwise.InternWise.dto.InternDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interns")
@CrossOrigin("http://localhost:4200/")
public class InternController {

    private final InternService internService;

    public InternController(InternService internService) {
        this.internService = internService;
    }

    @PostMapping("/create")
    public ResponseEntity<InternEntity> createIntern(@RequestBody InternDto intern) {
        InternEntity createdIntern = internService.createIntern(intern);
        return new ResponseEntity<>(createdIntern, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<InternEntity> modifyIntern(@RequestBody InternEntity intern,@PathVariable int id) {
        InternEntity modifiedIntern = internService.modifyIntern(intern, id);
        return new ResponseEntity<>(modifiedIntern, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIntern(@PathVariable int id) {
        internService.deleteIntern(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InternEntity> getInternById(@PathVariable int id) {
        InternEntity intern = internService.findById(id);
        return new ResponseEntity<>(intern, HttpStatus.OK);
    }

    @GetMapping("/byYear/{year}")
    public ResponseEntity<List<InternEntity>> getInternsByYear(@PathVariable int year) {
        List<InternEntity> interns = internService.findByYear(year);
        return new ResponseEntity<>(interns, HttpStatus.OK);
    }

    @GetMapping("/byEtudiant")
    public ResponseEntity<List<InternEntity>> getInternsByEtudiant(@RequestBody EtudiantEntity etudiant) {
        List<InternEntity> interns = internService.findByEtudiant(etudiant);
        return new ResponseEntity<>(interns, HttpStatus.OK);
    }

    @GetMapping("/byEtudiantAndYear")
    public ResponseEntity<List<InternEntity>> getInternsByEtudiantAndYear(@RequestBody EtudiantEntity etudiant, @RequestParam int year) {
        List<InternEntity> interns = internService.findByEtudiantAndYear(etudiant, year);
        return new ResponseEntity<>(interns, HttpStatus.OK);
    }

    @PostMapping("/end/{id}")
    public ResponseEntity<String> endIntern(@PathVariable int id){
        internService.endIntern(id);

        return new ResponseEntity<>("le stage a terminé", HttpStatus.OK);
    }

    @PostMapping("/start/{id}")
    public ResponseEntity<String> startIntern(@PathVariable int id){
        internService.startIntern(id);

        return new ResponseEntity<>("le stage a commencé", HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<InternEntity>> findAll(){
        return new ResponseEntity<>(internService.findAll(),HttpStatus.OK);
    }

}
