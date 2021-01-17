package com.weichuang.pojo;

public class Order {

    private int id;
    private String ono;
    private String createTime;
    private int userId;
    //第二种一对一关联查询解决方案 -- 不推荐
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ono='" + ono + '\'' +
                ", createTime='" + createTime + '\'' +
                ", userId=" + userId +
                ", user=" + user +
                '}';
    }
}
