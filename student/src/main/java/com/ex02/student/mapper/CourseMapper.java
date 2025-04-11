package com.ex02.student.mapper;

import com.ex02.student.po.Course;


public interface CourseMapper {
    Course selectCourseByCno(int cno);
    Course selectCourseByCname(String cname);
    int insertCourse(Course course);
    int deleteCourse(int cno);
    int updateCourse(Course course);
}
