package com.gduf.ex04.dao;

import com.gduf.ex04.po.Student;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentCourseDao {
    @Select("select * from stu where sno=#{sno};")
    @Results({@Result(column = "sno", property = "courseList", many = @Many(select = "com.gduf.ex04.dao.CourseDao.findCourseBySno"))})
    Student findStudentCourseBySno(String sno);
}
