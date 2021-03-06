package com.austinanimalcenter.shelter.inout;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntakesDaoTest {

    @Autowired
    IntakesDao intakesDao;

    @Autowired
    IntakesRepository intakesRepository;

    @Test
    public void selectAllOrderByAnimalId() {
        //given
        Intakes intakes = Intakes.builder()
                            .animalId("foo")
                            .animalType("none")
                            .datetime(null)
                            .intakeCondition("good")
                            .name("foo")
                            .sexUponIntake("unknown")
                            .build();
        this.intakesRepository.saveAndFlush(intakes);

        // when & then
        List<Intakes> intakesList = this.intakesDao.selectAllOrderByAnimalId();
        intakesList.stream().forEach(System.out::println);
    }


    @Test
    public void selectAllOrderByAnimalIdDesc() {
        //given
        Intakes intakes = Intakes.builder()
                .animalId("foo")
                .animalType("none")
                .datetime(null)
                .intakeCondition("good")
                .name("foo")
                .sexUponIntake("unknown")
                .build();
        this.intakesRepository.saveAndFlush(intakes);

        // when & then
        List<Intakes> intakesList = this.intakesDao.selectAllOrderByAnimalIdDesc();
        intakesList.stream().forEach(System.out::println);
    }

    @Test
    public void selectSickAnimal() {
        //given
        Intakes intakes = Intakes.builder()
                .animalId("foo")
                .animalType("none")
                .datetime(null)
                .intakeCondition("Sick")
                .name("foo")
                .sexUponIntake("unknown")
                .build();
        this.intakesRepository.saveAndFlush(intakes);

        // when & then
        List<Intakes> intakesList = this.intakesDao.selectSickAnimal();
        intakesList.stream().forEach(System.out::println);
    }

    @Test
    public void selectNotAgedAnimal() {
        //given
        Intakes intakes = Intakes.builder()
                .animalId("foo")
                .animalType("none")
                .datetime(null)
                .intakeCondition("Sick")
                .name("foo")
                .sexUponIntake("unknown")
                .build();
        this.intakesRepository.saveAndFlush(intakes);

        // when & then
        List<Intakes> intakesList = this.intakesDao.selectNotAgedAnimal();
        intakesList.stream().forEach(System.out::println);
    }

    @Test
    public void selectFirstInAnimalName() {
        //given
        Intakes intakes = Intakes.builder()
                .animalId("foo")
                .animalType("none")
                .datetime(null)
                .intakeCondition("Sick")
                .name("foo")
                .sexUponIntake("unknown")
                .build();
        this.intakesRepository.saveAndFlush(intakes);

        // when & then
        List<Intakes> intakesList = this.intakesDao.selectFirstInAnimalName();
        intakesList.stream().forEach(System.out::println);
    }
    @Test
    public void selectDuplicateAnimalName() {
        //given
        Intakes intakes = Intakes.builder()
                .animalId("foo")
                .animalType("none")
                .datetime(null)
                .intakeCondition("Sick")
                .name("foo")
                .sexUponIntake("unknown")
                .build();
        this.intakesRepository.saveAndFlush(intakes);

        // when & then
        List<Intakes> intakesList = this.intakesDao.selectDuplicateAnimalName();
        intakesList.stream().forEach(System.out::println);
    }

}