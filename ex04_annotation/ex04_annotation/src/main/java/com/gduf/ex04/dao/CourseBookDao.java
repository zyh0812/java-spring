package com.gduf.ex04.dao;

import com.gduf.ex04.po.Course;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface CourseBookDao {
    @Select("select * from course where cno=#{cno};")
    @Results({@Result(column = "id",property = "book",one=@One(select = "com.gduf.ex04.dao.BookDao.findBookById"))})
    Course findCourseBookByCno(int cno);
}
