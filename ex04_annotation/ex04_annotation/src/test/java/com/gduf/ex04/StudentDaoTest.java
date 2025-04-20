package com.gduf.ex04;

import com.gduf.ex04.dao.StudentDao;
import com.gduf.ex04.po.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.StudentDBUtil;

public class StudentDaoTest {
    @Test
    public void findStudentWithIdCardBySnoTest() {
        System.out.println("findStudentWithIdCardBySnoTest:");
        try (SqlSession sqlSession = StudentDBUtil.getSession()) {
            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

            Student student = studentDao.findStudentWithIdCardBySno("100000001");
            System.out.println(student);
        }
    }
}