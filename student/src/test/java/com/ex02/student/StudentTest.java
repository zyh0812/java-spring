package com.ex02.student;

import com.ex02.student.mapper.StudentMapper;
import com.ex02.student.po.Student;
import com.ex02.student.utils.StudentDBUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
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

        student.setSname("周宇鸿");

        Student name = mapper.selectStudentBySname("尚小云");
        System.out.println(name);

        int i = mapper.insertStudent(new Student("100000004","周宇鸿","男","武汉",'3'));
        System.out.println(i);

        int j = mapper.updateStudent(student);
        System.out.println(j);

        int m = mapper.deleteStudent("100000004");
        System.out.println(m);


        sqlSession.close();
    }
    @Test
    public void selectStudentTest(){
        System.out.println("selectStudentTest");
        SqlSession sqlSession = StudentDBUtil.getSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setSno("");
        student.setSname("");
        List<Student> list = studentMapper.selectStudent(student);
        for (Student stu : list)
            System.out.println(stu);
        sqlSession.close();
    }

    @Test
    public void selectStudentBySnamesTest(){
        System.out.println("selectStudentBySnamesTest");
        SqlSession sqlSession = StudentDBUtil.getSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<String> list = new ArrayList<String>();
        list.add("尚小云");
        list.add("刘伟");
        list.add("宋凌枫");
        List<Student> stuList = studentMapper.selectStudentBySnames(list);
        for (Student stu : stuList)
            System.out.println(stu);
    }

    @Test
    public void selectStudentScoresBySnoTest(){
        System.out.println("selectStudentScoresBySnoTest");
        SqlSession sqlSession = StudentDBUtil.getSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.selectStudentScoresBySno("100000001");
        System.out.println(student);
    }

}

