package com.gduf.ex04.dao;

import com.gduf.ex04.po.Course;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface CourseStudentDao {
    @Select("SELECT * FROM course WHERE cno = #{cno}")
    @Results({
            @Result(
                    column = "cno",
                    property = "studentList",
                    many = @Many(select = "com.gduf.ex04.dao.CourseDao.findStudentsByCno")
            )
    })
    Course findCourseStudentsByCno(int cno);
}