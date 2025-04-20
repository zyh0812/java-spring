package com.gduf.ex04;

import com.gduf.ex04.dao.CourseScDao;
import com.gduf.ex04.po.Course;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.StudentDBUtil;

public class CourseScDaoTest {
    @Test
    public void findCourseScByCnoTest() {
        System.out.println("findCourseScByCnoTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        CourseScDao courseScDao = sqlSession.getMapper(CourseScDao.class);

        Course course = courseScDao.findCourseScByCno(1);
        System.out.println(course);
        sqlSession.close();
    }
}