package com.ex02.student;

import com.ex02.student.mapper.StudentMapper;
import com.ex02.student.po.Student;
import com.ex02.student.utils.StudentDBUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {
    @Test
    public void studentTest(){
        SqlSession sqlSession = StudentDBUtil.getSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        int count = -1;

        // 生成Mapper的代理对象studentMapper
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        // 精确查询测试
        Student student = studentMapper.selectStudentBySno("100000001");
        System.out.println(student);

        student.setSname("杜文哲");

        Student name = mapper.selectStudentBySname("尚小云");
        System.out.println(name);

        int i = mapper.insertStudent(new Student("100000005","杜文哲","男","武汉",'3'));
        System.out.println(i);

        int j = mapper.updateStudent(student);
        System.out.println(j);

        int m = mapper.deleteStudent("100000005");
        System.out.println(m);


        sqlSession.close();
    }
}

