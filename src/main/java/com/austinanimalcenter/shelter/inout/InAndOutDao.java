package com.austinanimalcenter.shelter.inout;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class InAndOutDao {

    private static final String NAME_SPACE = "com.austinanimalcenter.shelter.inout.InAndOut.";

    @Autowired
    SqlSession sqlSession;


    public List<Map<String, String>> selectNotFoundIntakeInOutcomesAnimal() {
        return this.sqlSession.selectList(InAndOutDao.NAME_SPACE + "selectNotFoundIntakeInOutcomesAnimal");
    }


    public List<Map<String, String>> selectOutcomeFasterThanIntake() {
        return this.sqlSession.selectList(InAndOutDao.NAME_SPACE + "selectOutcomeFasterThanIntake");
    }


}
