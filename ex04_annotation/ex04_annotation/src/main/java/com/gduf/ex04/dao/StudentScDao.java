package com.gduf.ex04.dao;

import com.gduf.ex04.po.Student;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface StudentScDao {
    @Select("select * from stu where sno=#{sno};")
    @Results({@Result(column = "sno",
            property = "scList",
            many = @Many(select = "com.gduf.ex04.dao.ScDao.findScBySno"))})
    Student findStudentScBySno(String sno);
}
