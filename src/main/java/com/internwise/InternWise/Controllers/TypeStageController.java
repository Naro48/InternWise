package com.internwise.InternWise.Controllers;

import com.internwise.InternWise.Service.TypeStageImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/typestage")
@CrossOrigin("http://localhost:4200/")
public class TypeStageController {
    private final TypeStageImpl typeStage;


    public TypeStageController(TypeStageImpl typeStage) {
        this.typeStage = typeStage;
    }


}
