package com.gduf.ex04.dao;

import com.gduf.ex04.po.Course;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface CourseScDao {
    @Select("select * from course where cno=#{cno};")
    @Results({
            @Result(column = "cno", property = "scList",
                    many = @Many(select = "com.gduf.ex04.dao.ScDao.findScByCno"))
    })
    Course findCourseScByCno(int cno);
}