package com.weichuang.pojo;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private int age;
    private String username;
    private int money;
    private int sex;

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", money=" + money +
                '}';
    }
}
