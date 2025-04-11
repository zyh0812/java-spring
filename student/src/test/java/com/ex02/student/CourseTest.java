package com.ex02.student;
import com.ex02.student.mapper.CourseMapper;
import com.ex02.student.po.Course;
import com.ex02.student.utils.StudentDBUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
public class CourseTest {
    @Test
    public void studentTest(){
        SqlSession sqlSession = StudentDBUtil.getSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
        int count = -1;

        // 生成Mapper的代理对象studentMapper
        CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
        // 精确查询测试
        Course course = courseMapper.selectCourseByCno(1);
        System.out.println(course);

        course.setCname("杜文哲");

        Course name = mapper.selectCourseByCname("高等数学");
        System.out.println(name);

        int insert = mapper.insertCourse(new Course(5,"商务英语",80));
        System.out.println(insert);

        int update = mapper.updateCourse(course);
        System.out.println(update);

        int delete = mapper.deleteCourse(5);
        System.out.println(delete);


        sqlSession.close();
    }
}
