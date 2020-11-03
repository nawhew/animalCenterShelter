package com.austinanimalcenter.shelter.inout;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter @Setter @EqualsAndHashCode(of = "animalId")
@Builder @ToString @NoArgsConstructor @AllArgsConstructor
public class Intakes {

    @Id
    private String animalId;

    private String ageUponIntake;

    private String animalType;

    private String breed;

    private String color;

    private Date datetime;

    private Date datetime2;

    private String foundLocation;

    private String intakeCondition;

    private String intakeType;

    private String name;

    private String sexUponIntake;

}
