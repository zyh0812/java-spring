package com.ex02.student;

import com.ex02.student.mapper.ScMapper;
import com.ex02.student.po.Sc;
import com.ex02.student.utils.StudentDBUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
public class ScTest {
    @Test
    public void scTest(){
        SqlSession sqlSession = StudentDBUtil.getSession();
        ScMapper mapper = sqlSession.getMapper(ScMapper.class);

        // 生成Mapper的代理对象studentMapper
        ScMapper courseMapper = sqlSession.getMapper(ScMapper.class);
        // 精确查询测试
        Sc sc= courseMapper.selectScBySno("100000002");
        System.out.println(sc);

        Sc sno = mapper.selectScBySno1("100000002");
        System.out.println(sno);

        int i = mapper.insertSc(new Sc("100000003",3,3,82,78,82));
        System.out.println(i);

        int m = mapper.updateSc(sc);
        System.out.println(m);

        int j = mapper.deleteSc("100000003");
        System.out.println(j);

        sqlSession.close();
    }

}