package com.mxdl.desigin.pattern.behavior.a06_memento.entity;

/**
 * Description: <APerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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
    public MementtoPerson createMementtoPerson(){
        MementtoPerson mementtoPerson = new MementtoPerson();
        mementtoPerson.setName(this.name);
        mementtoPerson.setAge(this.age);
        return mementtoPerson;
    }
    public void reMementtoPerson(MementtoPerson mementtoPerson){
        this.name = mementtoPerson.getName();
        this.age = mementtoPerson.getAge();
    }

    @Override
    public String toString() {
        return "APerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
