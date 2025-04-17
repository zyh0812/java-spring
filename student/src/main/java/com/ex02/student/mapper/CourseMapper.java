package com.ex02.student.mapper;

import com.ex02.student.po.Course;

import java.util.List;


public interface CourseMapper {
    Course selectCourseByCno(int cno);
    Course selectCourseByCname(String cname);
    int insertCourse(Course course);
    int deleteCourse(int cno);
    int updateCourse(Course course);
    List<Course> selectCourseByCnames(List<String> list);
    Course selectCourseBookByCno(int cno);

    Course selectresultCourseBookByCno(int cno);

    Course selectCourseStudentsByCno(int cno);
}
