package com.gduf.ex04.dao;

import com.gduf.ex04.po.IdCard;
import org.apache.ibatis.annotations.Select;

public interface IdCardDao {
    @Select("SELECT * FROM idcard WHERE id = #{id};")
    IdCard findById(int id);
}