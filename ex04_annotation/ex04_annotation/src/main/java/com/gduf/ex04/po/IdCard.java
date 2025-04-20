package com.gduf.ex04.po;

public class IdCard {
    private int id;
    private String card_no;
    private String card_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "id=" + id +
                ", card_no='" + card_no + '\'' +
                ", card_name='" + card_name + '\'' +
                '}';
    }
}
