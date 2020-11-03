package com.austinanimalcenter.shelter.inout;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

//@Entity @Table(name = "INTAKE_OUTCOMES")
public class InAndOut {

    private String ageUponOutcome;

    private String animalIdOutcome;

    private Date dateOfBirth;

    private String outcomeSubtype;

    private String outcomeType;

    private String sexUponOutcome;

    private Float ageUponOutcomeDays;

    private Float ageUponOutcomeYears;

}
