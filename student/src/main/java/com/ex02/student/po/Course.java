package com.ex02.student.po;

import java.util.List;

public class Course {
    private int cno;
    private String cname;
    private int period;
    private Book book = null;
    private List<Student> studentList =null;

    public Course() {
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", period=" + period +
                ", book=" + book +
                ", studentList=" + studentList +
                '}';
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public Course(int cno, String cname, int period) {
        this.cno = cno;
        this.cname = cname;
        this.period = period;
    }
}
