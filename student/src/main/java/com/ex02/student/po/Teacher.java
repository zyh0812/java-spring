package com.ex02.student.po;

public class Teacher {
    private int tno;
    private String tname;
    private String tsex;
    private String tel;

    @Override
    public String toString() {
        return "Teacher{" +
                "tno='" + tno + '\'' +
                ", tname='" + tname + '\'' +
                ", tsex='" + tsex + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Teacher(int tno, String tname, String tsex, String tel) {
        this.tno = tno;
        this.tname = tname;
        this.tsex = tsex;
        this.tel = tel;
    }
}
