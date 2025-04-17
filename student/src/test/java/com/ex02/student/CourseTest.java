package com.ex02.student;
import com.ex02.student.mapper.CourseMapper;
import com.ex02.student.po.Course;
import com.ex02.student.utils.StudentDBUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CourseTest {
    @Test
    public void studentTest(){
        SqlSession sqlSession = StudentDBUtil.getSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        int count = -1;

        // 生成Mapper的代理对象studentMapper
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        // 精确查询测试
        Course course = courseMapper.selectCourseByCno(1);
        System.out.println(course);

        course.setCname("周宇鸿");

        Course name = mapper.selectCourseByCname("高等数学");
        System.out.println(name);

        int insert = mapper.insertCourse(new Course(5,"软件工程",80));
        System.out.println(insert);

        int update = mapper.updateCourse(course);
        System.out.println(update);

        int delete = mapper.deleteCourse(5);
        System.out.println(delete);


        sqlSession.close();
    }
    @Test
    public void selectCourseByCnames(){
        System.out.println("selectCourseByCnamesTest");
        SqlSession sqlSession = StudentDBUtil.getSession();
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        List<String> list = new ArrayList<String>();
        list.add("高等数学");
        list.add("大学英语");
        list.add("数据库原理与应用");
        list.add("数据结构");
        List<Course> courseList = courseMapper.selectCourseByCnames(list);
        for (Course course : courseList)
            System.out.println(course);
    }

    @Test
    public void courseBookTest(){
        System.out.println("courseTest：");
        SqlSession sqlSession = StudentDBUtil.getSession();
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        Course course = courseMapper.selectCourseBookByCno(1);
        System.out.println(course);
    }

    @Test
    public void courseresultBookTest(){
        SqlSession sqlSession = StudentDBUtil.getSession();
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        Course course = courseMapper.selectresultCourseBookByCno(1);
        System.out.println(course);
    }


    @Test
    public void courseStudentTest(){
        System.out.println("courseStudentTest：");
        SqlSession sqlSession = StudentDBUtil.getSession();
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        Course course = courseMapper.selectCourseStudentsByCno(1);
        System.out.println(course);
    }
}

