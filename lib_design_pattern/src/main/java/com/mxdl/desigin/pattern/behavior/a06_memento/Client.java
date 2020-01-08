package com.mxdl.desigin.pattern.behavior.a06_memento;


import com.mxdl.desigin.pattern.behavior.a06_memento.entity.MementtoPerson;
import com.mxdl.desigin.pattern.behavior.a06_memento.entity.Person;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Person("zhangsan",18);
        System.out.println(person.toString());
        MementtoPerson mementtoPerson = person.createMementtoPerson();
        person.setAge(21);
        System.out.println(person.toString());
        person.reMementtoPerson(mementtoPerson);
        System.out.println(person.toString());
    }
}
