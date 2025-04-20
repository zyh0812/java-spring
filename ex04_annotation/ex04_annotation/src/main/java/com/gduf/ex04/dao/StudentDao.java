package com.gduf.ex04.dao;

import com.gduf.ex04.po.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StudentDao {
    @Select("select * from stu where sno=#{sno};")
    Student findStudentBySno(String sno);
    @Select("select * from stu;")
    List<Student> findStudentAll();
    @Select("select * from stu where sname like '%${sname}%';")
    List<Student> findStudentBySname(String sname);
    @Insert("insert into stu(sno,sname,ssex,snative,mno) values(#{sno},#{sname},#{ssex},#{snative},#{mno});")
    int insertStudent(Student student);
    @Update({"update stu set sno=#{sno},sname=#{sname},ssex=#{ssex},snative=#{snative},mno=#{mno}"," where sno=#{sno};"})
    int updateStudent(Student student);
    @Delete("delete from stu where " + " sno=#{sno};")
    int deleteStudentBySno(String sno);
    @Select("SELECT * FROM stu WHERE sno = #{sno};")
    @Results({
            @Result(column = "card_id", property = "idCard",
                    one = @One(select = "com.gduf.ex04.dao.IdCardDao.findById"))
    })
    Student findStudentWithIdCardBySno(String sno);
}
