package com.internwise.InternWise.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "TypeStage")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypeStageEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codeTypeStage")
    private Integer codeTypeStage;

    @Column(name = "nbrSemaines")
    private Integer nbrSemaines;
}
