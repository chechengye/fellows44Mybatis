package com.weichuang.pojo;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private int id;
    private String name;
    private int age;
    private String username;
    private int money;
    private int sex;
    private List<Order> orderList;

    //构造方法
    public User(){
       /* System.out.println("无参的构造方法");*/
    }

    /**
     * 初始化参数的配置
     */
    public void init(){
        System.out.println("初始化方法");
    }

    /**
     * 销亡时调用的方法
     */
    public void destroy(){
        System.out.println("销毁方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", money=" + money +
                ", sex=" + sex +
                ", orderList=" + orderList +
                '}';
    }
}
