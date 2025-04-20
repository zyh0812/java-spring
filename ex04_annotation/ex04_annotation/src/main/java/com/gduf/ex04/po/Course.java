package com.gduf.ex04.po;

import java.util.List;

public class Course {
    private int cno;
    private String cname;
    private int period;
    private Book book;
    private List<Sc>scList;
    private List<Student> studentList;

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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Sc> getScList() {
        return scList;
    }

    public void setScList(List<Sc> scList) {
        this.scList = scList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno=" + cno +
                ", cname='" + cname + '\'' +
                ", period=" + period +
                ", book=" + book +
                ", scList=" + scList +
                ", studentList=" + studentList +
                '}';
    }
}
