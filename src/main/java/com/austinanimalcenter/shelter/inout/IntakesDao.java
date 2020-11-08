package com.austinanimalcenter.shelter.inout;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IntakesDao {

    private static final String NAME_SPACE = "com.austinanimalcenter.shelter.inout.Intakes.";

    @Autowired
    SqlSession sqlSession;

    public List<Intakes> selectAllOrderByAnimalId() {
        return this.sqlSession.selectList(IntakesDao.NAME_SPACE + "selectAllOrderByAnimalId");
    }

    public List<Intakes> selectAllOrderByAnimalIdDesc() {
        return this.sqlSession.selectList(IntakesDao.NAME_SPACE + "selectAllOrderByAnimalIdDesc");
    }

    public List<Intakes> selectSickAnimal() {
        return this.sqlSession.selectList(IntakesDao.NAME_SPACE + "selectSickAnimal");
    }

    public List<Intakes> selectNotAgedAnimal() {
        return this.sqlSession.selectList(IntakesDao.NAME_SPACE + "selectNotAgedAnimal");
    }

    public List<Intakes> selectFirstInAnimalName() {
        return this.sqlSession.selectList(IntakesDao.NAME_SPACE + "selectFirstInAnimalName");
    }

    public List<Intakes> selectCountCatAndDog() {
        return this.sqlSession.selectList(IntakesDao.NAME_SPACE + "selectCountCatAndDog");
    }

    public List<Intakes> selectDuplicateAnimalName() {
        return this.sqlSession.selectList(IntakesDao.NAME_SPACE + "selectDuplicateAnimalName");
    }

    public List<Intakes> selectIntakeDogs() {
        return this.sqlSession.selectList(IntakesDao.NAME_SPACE + "selectIntakeDogs");
    }

}
