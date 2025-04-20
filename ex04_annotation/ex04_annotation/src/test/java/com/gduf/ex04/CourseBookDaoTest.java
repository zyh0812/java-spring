package com.gduf.ex04;

import com.gduf.ex04.dao.CourseBookDao;
import com.gduf.ex04.po.Course;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.StudentDBUtil;

public class CourseBookDaoTest {
    @Test
    public void findCourseBookByCnoTest(){
        System.out.println("findCourseBookByCnoTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        CourseBookDao courseBookDao = sqlSession.getMapper(CourseBookDao.class);

        Course course = courseBookDao.findCourseBookByCno(1);
        System.out.println(course);
        sqlSession.close();
    }
}
