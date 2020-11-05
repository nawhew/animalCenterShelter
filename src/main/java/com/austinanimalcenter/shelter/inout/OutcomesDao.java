package com.austinanimalcenter.shelter.inout;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OutcomesDao {

    private static final String NAME_SPACE = "com.austinanimalcenter.shelter.inout.Outcomes.";

    @Autowired
    SqlSession sqlSession;


    public List<Outcomes> selectOutcomeGroupByHour() {
        return this.sqlSession.selectList(OutcomesDao.NAME_SPACE + "selectOutcomeGroupByHour");
    }

}
