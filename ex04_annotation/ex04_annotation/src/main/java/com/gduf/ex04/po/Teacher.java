package com.gduf.ex04.po;

public class Teacher {
    private String tno;     // 教师编号
    private String tname;   // 教师姓名
    private String tsex;    // 教师性别
    private String tel;     // 联系电话

    // 生成 getter/setter 和 toString 方法（必须！）
    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
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

    @Override
    public String toString() {
        return "Teacher{" +
                "tno='" + tno + '\'' +
                ", tname='" + tname + '\'' +
                ", tsex='" + tsex + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}