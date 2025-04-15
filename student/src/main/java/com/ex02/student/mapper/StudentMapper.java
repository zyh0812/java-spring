package com.ex02.student.mapper;

import com.ex02.student.po.Student;

import java.util.List;

public interface StudentMapper {
    Student selectStudentBySno(String sno);
    Student selectStudentBySname(String sname);
    int insertStudent(Student student);
    int deleteStudent(String sno);
    int updateStudent(Student stu);
    List<Student> selectStudent(Student student);
    List<Student> selectStudentBySnames(List<String> list);
    Student selectStudentScoresBySno(String sno);

}
