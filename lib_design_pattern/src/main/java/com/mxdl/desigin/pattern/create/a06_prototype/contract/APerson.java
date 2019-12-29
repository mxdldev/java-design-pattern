package com.mxdl.desigin.pattern.create.a06_prototype.contract;

/**
 * Description: <APerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class APerson {
    private String name;
    private int age;

    public APerson(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "APerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
