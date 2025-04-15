package com.ex02.student.po;

public class Score {
    private String sno;
    private int cno;
    private int tno;
    private float participation;
    private float final1;
    private float total;

    // 省略了getter和setter方法


    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public float getParticipation() {
        return participation;
    }

    public void setParticipation(float participation) {
        this.participation = participation;
    }

    public float getfinal1() {
        return final1;
    }

    public void setfinal1(float sfinal) {
        this.final1 = sfinal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Score{" +
                "sno='" + sno + '\'' +
                ", cno=" + cno +
                ", tno=" + tno +
                ", participation=" + participation +
                ", sfinal=" + final1 +
                ", total=" + total +
                '}';
    }
}
