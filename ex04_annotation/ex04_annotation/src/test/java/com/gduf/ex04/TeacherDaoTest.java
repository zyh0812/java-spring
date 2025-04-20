package com.gduf.ex04;

import com.gduf.ex04.dao.TeacherDao;
import com.gduf.ex04.po.Teacher;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.StudentDBUtil;

import java.util.List;

public class TeacherDaoTest {
    // 测试按工号查询
    @Test
    public void findTeacherByTnoTest() {
        System.out.println("findTeacherByTnoTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);

        Teacher teacher = teacherDao.findTeacherByTno("1");
        System.out.println(teacher);
        sqlSession.close();
    }

    // 测试查询全部教师
    @Test
    public void findAllTeachersTest() {
        System.out.println("findAllTeachersTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);

        List<Teacher> teacherList = teacherDao.findAllTeachers();
        System.out.println(teacherList);
        sqlSession.close();
    }

    // 测试按姓名模糊查询
    @Test
    public void findTeacherByTnameTest() {
        System.out.println("findTeacherByTnameTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);

        List<Teacher> teacherList = teacherDao.findTeacherByTname("杨");
        System.out.println(teacherList);
        sqlSession.close();
    }

    // 测试插入教师
    @Test
    public void insertTeacherTest() {
        System.out.println("insertTeacherTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);

        Teacher teacher = new Teacher();
        teacher.setTno("5");
        teacher.setTname("周老师");
        teacher.setTsex("男");
        teacher.setTel("15083842214");

        int lines = teacherDao.insertTeacher(teacher);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功插入了" + lines + "条记录");
    }

    // 测试更新教师信息
    @Test
    public void updateTeacherTest() {
        System.out.println("updateTeacherTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);

        Teacher teacher = new Teacher();
        teacher.setTno("5");
        teacher.setTname("周");
        teacher.setTsex("男");
        teacher.setTel("15083842214");

        int lines = teacherDao.updateTeacher(teacher);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功更新了" + lines + "条记录");
    }

    // 测试删除教师
    @Test
    public void deleteTeacherByTnoTest() {
        System.out.println("deleteTeacherByTnoTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);

        int lines = teacherDao.deleteTeacherByTno("5");
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功删除了" + lines + "条记录");
    }
}