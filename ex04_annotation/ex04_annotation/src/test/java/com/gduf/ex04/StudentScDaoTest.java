package com.gduf.ex04;

import com.gduf.ex04.dao.StudentScDao;
import com.gduf.ex04.po.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.StudentDBUtil;

public class StudentScDaoTest {
    @Test
    public void findStudentScBySnoTest(){
        System.out.println("findStudentScBySnoTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        StudentScDao studentScDao = sqlSession.getMapper(StudentScDao.class);

        Student student = studentScDao.findStudentScBySno("100000001");
        System.out.println(student);
        sqlSession.close();
    }
}
