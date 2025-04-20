package com.gduf.ex04;

import com.gduf.ex04.dao.CourseStudentDao;
import com.gduf.ex04.po.Course;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.StudentDBUtil;

public class CourseStudentDaoTest {
    @Test
    public void findCourseStudentsByCnoTest() {
        System.out.println("findCourseStudentsByCnoTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        CourseStudentDao courseStudentDao = sqlSession.getMapper(CourseStudentDao.class);

        Course course = courseStudentDao.findCourseStudentsByCno(1); // 查询课程号为1的课程
        System.out.println(course);
        sqlSession.close();
    }
}