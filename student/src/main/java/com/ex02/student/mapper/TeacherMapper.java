package com.ex02.student.mapper;

import com.ex02.student.po.Teacher;

public interface TeacherMapper {

    Teacher selectTeacherByTno(int tno);
    Teacher selectTeacherByTname(String tname);
    int insertTeacher(Teacher teacher);
    int deleteTeacher(int tno);
    int updateTeacher(Teacher teacher);
}
