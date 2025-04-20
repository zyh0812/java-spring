package com.gduf.ex04.dao;

import com.gduf.ex04.po.Sc;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ScDao {
    @Select("select * from sc where sno=#{sno};")
    List<Sc> findScBySno(String sno);

    // 新增按课程号查询成绩的方法
    @Select("select * from sc where cno=#{cno};")
    List<Sc> findScByCno(int cno);
}
