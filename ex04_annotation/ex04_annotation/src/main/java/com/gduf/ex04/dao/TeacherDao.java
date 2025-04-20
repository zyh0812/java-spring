package com.gduf.ex04.dao;

import com.gduf.ex04.po.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface TeacherDao {
    // 按工号查询
    @Select("SELECT * FROM teacher WHERE tno = #{tno}")
    Teacher findTeacherByTno(String tno);

    // 查询全部教师
    @Select("SELECT * FROM teacher")
    List<Teacher> findAllTeachers();

    // 按姓名模糊查询
    @Select("SELECT * FROM teacher WHERE tname LIKE CONCAT('%', #{tname}, '%')")
    List<Teacher> findTeacherByTname(String tname);

    // 插入教师
    @Insert("INSERT INTO teacher(tno, tname, tsex, tel) " +
            "VALUES(#{tno}, #{tname}, #{tsex}, #{tel})")
    int insertTeacher(Teacher teacher);

    // 更新教师信息
    @Update("UPDATE teacher SET tname=#{tname}, tsex=#{tsex}, tel=#{tel} " +
            "WHERE tno=#{tno}")
    int updateTeacher(Teacher teacher);

    // 删除教师
    @Delete("DELETE FROM teacher WHERE tno=#{tno}")
    int deleteTeacherByTno(String tno);
}