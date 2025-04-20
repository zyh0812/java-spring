package com.gduf.ex04.dao;

import com.gduf.ex04.po.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookDao {
    // 按 id 查询
    @Select("SELECT * FROM book WHERE id = #{id}")
    Book findBookById(String id);

    // 查询全部
    @Select("SELECT * FROM book")
    List<Book> findAllBooks();

    // 插入（注意字段顺序）
    @Insert("INSERT INTO book(id, bname, price, pub) " +
            "VALUES(#{id}, #{bname}, #{price}, #{pub})")
    int insertBook(Book book);

    // 更新（根据 id 修改其他字段）
    @Update("UPDATE book SET bname=#{bname}, price=#{price}, pub=#{pub} " +
            "WHERE id=#{id}")
    int updateBook(Book book);

    // 删除
    @Delete("DELETE FROM book WHERE id=#{id}")
    int deleteBookById(String id);
}