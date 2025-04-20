package com.gduf.ex04.dao;

import com.gduf.ex04.po.Course;
import com.gduf.ex04.po.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseDao {
    @Select("select * from course where cno in (select cno from sc where sno=#{sno});")
    List<Course> findCourseBySno(String sno);

    @Select("SELECT * FROM stu WHERE sno IN (SELECT sno FROM sc WHERE cno = #{cno})")
    List<Student> findStudentsByCno(int cno);
}
