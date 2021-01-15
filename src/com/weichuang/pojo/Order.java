package com.weichuang.pojo;

public class Order {

    private int id;
    private String ono;
    private String createTime;

    public String getOno() {
        return ono;
    }

    public void setOno(String ono) {
        this.ono = ono;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ono='" + ono + '\'' +
                ", createtime='" + createTime + '\'' +
                '}';
    }
}
