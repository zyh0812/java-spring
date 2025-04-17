package com.ex02.student.po;

import java.util.List;

public class Student {
    private String sno;
    private String sname;
    private String ssex ;
    private String snative;
    private int mno;
    private List<Score> listScore = null;
    private List<Course> courseList = null;

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", snative='" + snative + '\'' +
                ", mno=" + mno +
                ", listScore=" + listScore +
                ", courseList=" + courseList +
                '}';
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Student() {

    }

    // 省略了getter和setter方法


    public List<Score> getListScore() {
        return listScore;
    }

    public void setListScore(List<Score> listScore) {
        this.listScore = listScore;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSnative() {
        return snative;
    }

    public void setSnative(String snative) {
        this.snative = snative;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public Student(String sno, String sname, String ssex, String snative, int mno) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.snative = snative;
        this.mno = mno;
    }
}
