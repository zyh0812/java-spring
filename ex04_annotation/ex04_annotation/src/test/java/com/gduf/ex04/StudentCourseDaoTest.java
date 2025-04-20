package com.gduf.ex04;

import com.gduf.ex04.dao.StudentCourseDao;
import com.gduf.ex04.po.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.StudentDBUtil;

public class StudentCourseDaoTest {
    @Test
    public void findStudentCourseBySnoTest(){
        System.out.println("findStudentCourseBySnoTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        StudentCourseDao studentCourseDao = sqlSession.getMapper(StudentCourseDao.class);

        Student student = studentCourseDao.findStudentCourseBySno("100000001");
        System.out.println(student);
        sqlSession.close();
    }
}
