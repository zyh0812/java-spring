package com.ex02.student;
import com.ex02.student.mapper.TeacherMapper;
import com.ex02.student.po.Teacher;
import com.ex02.student.utils.StudentDBUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TeacherTest {
    @Test
    public void teacherTest(){
        SqlSession sqlSession = StudentDBUtil.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);


        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = teacherMapper.selectTeacherByTno(1);
        System.out.println(teacher);

        teacher.setTname("周宇鸿");

        Teacher name = mapper.selectTeacherByTname("袁");
        System.out.println(name);

        int i = mapper.insertTeacher(new Teacher(4,"周宇鸿","男","1583842214"));
        System.out.println(i);

        int j = mapper.updateTeacher(teacher);
        System.out.println(j);

        int m = mapper.deleteTeacher(4);
        System.out.println(m);


        sqlSession.close();
    }
}
