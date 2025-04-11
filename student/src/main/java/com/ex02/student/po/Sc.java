package com.ex02.student.po;

public class Sc {
    private String sno;
    private int cno;
    private int tno;
    private float participation;
    private float final1;
    private float total;

    @Override
    public String toString() {
        return "Sc{" +
                "sno='" + sno + '\'' +
                ", cno=" + cno +
                ", tno=" + tno +
                ", participation=" + participation +
                ", final1=" + final1 +
                ", total=" + total +
                '}';
    }

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

    public float getFinal1() {
        return final1;
    }

    public void setFinal1(float final1) {
        this.final1 = final1;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Sc(String sno, int cno, int tno, float participation, float final1, float total) {
        this.sno = sno;
        this.cno = cno;
        this.tno = tno;
        this.participation = participation;
        this.final1 = final1;
        this.total = total;
    }
}
