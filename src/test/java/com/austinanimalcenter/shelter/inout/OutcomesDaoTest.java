package com.austinanimalcenter.shelter.inout;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OutcomesDaoTest {

    @Autowired
    OutcomesDao outcomesDao;

    @Test
    public void selectOutcomeGroupByHour() {
        //given

        // when & then
        List<Outcomes> outcomesList = this.outcomesDao.selectOutcomeGroupByHour();
        outcomesList.stream().forEach(System.out::println);
    }


}