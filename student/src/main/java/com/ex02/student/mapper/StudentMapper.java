package com.ex02.student.mapper;

import com.ex02.student.po.Student;

public interface StudentMapper {
    Student selectStudentBySno(String sno);
    Student selectStudentBySname(String sname);
    int insertStudent(Student student);
    int deleteStudent(String sno);
    int updateStudent(Student stu);

}
