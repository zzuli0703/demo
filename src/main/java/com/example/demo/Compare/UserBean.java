package com.example.demo.Compare;

/**
 * @author 640804
 * @ClassName UserBean
 * @Description
 * @date 2019/9/11 22:58
 * @Version 1.0
 */
public class UserBean {
    private String id;
    private String name;
    private String sex;
    private int age;

    public UserBean(String id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public UserBean() {

    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "UserBean [id=" + id + ", name=" + name + ", sex=" + sex
                + ", age=" + age + "]";
    }

}
