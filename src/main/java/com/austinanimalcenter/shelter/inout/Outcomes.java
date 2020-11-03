package com.austinanimalcenter.shelter.inout;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

//@Entity
public class Outcomes {

    @Id
    private String animalId;

    private String ageUponOutcome;

    private String animalType;

    private String breed;

    private String color;

    private Date dateOfBirth;

    private Date datetime;

    private Date monthYear;

    private String name;

    private String outcomeSubtype;

    private String outcomeType;

    private String sexUponOutcome;
}
