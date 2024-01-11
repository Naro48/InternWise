package com.internwise.InternWise.Controllers;

import com.internwise.InternWise.Entities.ProfEntity;
import com.internwise.InternWise.Entities.PromotionEntity;
import com.internwise.InternWise.Service.ProfImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prof")
public class ProfController {

    private final ProfImpl profService;

    public ProfController(ProfImpl profService) {
        this.profService = profService;
    }


    @GetMapping("/get/{id}")
    public ResponseEntity<ProfEntity> getProfById(@PathVariable("id") int id) {
        ProfEntity profEntity = profService.findById(id);
        return new ResponseEntity<>(profEntity, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ProfEntity> addProf(@RequestBody ProfEntity profEntity) {
        ProfEntity newProf = profService.addProf(profEntity);
        return new ResponseEntity<>(newProf, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ProfEntity> updateProf(
            @RequestBody ProfEntity modifiedProf,
            @PathVariable("id") int id) {
        ProfEntity updatedProf = profService.updateProf(modifiedProf, id);
        return new ResponseEntity<>(updatedProf, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProf(@PathVariable("id") int id) {
        profService.deleteProf(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/getByPromotion")
    public ResponseEntity<ProfEntity> getProfByPromotion(@RequestParam("promotionId") int promotionId) {
        PromotionEntity promotionEntity = new PromotionEntity();
        promotionEntity.setAnneePromo(promotionId);
        ProfEntity profEntity = profService.findByPromotion(promotionEntity);
        return new ResponseEntity<>(profEntity, HttpStatus.OK);
    }
}
