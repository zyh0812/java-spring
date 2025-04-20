package com.gduf.ex04;

import com.gduf.ex04.dao.BookDao;
import com.gduf.ex04.po.Book;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.StudentDBUtil;

import java.util.List;

public class BookDaoTest {

    @Test
    public void findBookByIdTest() {
        System.out.println("findBookByIdTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        Book book = bookDao.findBookById("1");
        System.out.println(book);
        sqlSession.close();
    }

    @Test
    public void findAllBooksTest() {
        System.out.println("findAllBooksTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        List<Book> bookList = bookDao.findAllBooks();
        System.out.println(bookList);
        sqlSession.close();
    }

    @Test
    public void insertBookTest() {
        System.out.println("insertBookTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        Book book = new Book();
        book.setId("8");
        book.setBname("JavaEE框架");
        book.setPrice(58.80);
        book.setPub("哈尔滨工业大学出版社");

        int lines = bookDao.insertBook(book);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功插入了" + lines + "条记录");
    }

    @Test
    public void updateBookTest() {
        System.out.println("updateBookTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        Book book = new Book();
        book.setId("8");
        book.setBname("JavaEE框架（微课版）");
        book.setPrice(99.99);
        book.setPub("哈尔滨工业大学出版社");

        int lines = bookDao.updateBook(book);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功更新了" + lines + "条记录");
    }

    @Test
    public void deleteBookByIdTest() {
        System.out.println("deleteBookByIdTest:");
        SqlSession sqlSession = StudentDBUtil.getSession();
        BookDao bookDao = sqlSession.getMapper(BookDao.class);

        int lines = bookDao.deleteBookById("8");
        sqlSession.commit();
        sqlSession.close();
        System.out.println("成功删除了" + lines + "条记录");
    }
}