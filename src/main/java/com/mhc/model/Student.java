package com.mhc.model;

/**
 * 学生类
 * @author Andre930
 * @create 2019-01-17 14:35
 */
public class Student {

    private  Integer id;
    private String  username;
    private String  gender;

    public Student() {
    }

    public Student(Integer id, String username, String gender) {
        this.id = id;
        this.username = username;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
