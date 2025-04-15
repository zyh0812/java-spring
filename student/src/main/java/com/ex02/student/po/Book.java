package com.ex02.student.po;

public class Book {
    private int id;
    private String bname;
    private float price;
    private String pub;

    // 省略了getter和setter方法 … …


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", pub='" + pub + '\'' +
                '}';
    }
}
