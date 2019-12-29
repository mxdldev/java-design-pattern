package com.mxdl.desigin.pattern.structure.a03_decorator;

import com.mxdl.desigin.pattern.structure.a03_decorator.entity.Person;
import com.mxdl.desigin.pattern.structure.a03_decorator.entity.SuperPerson;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        SuperPerson superPerson = new SuperPerson(new Person());
        superPerson.eat();
    }
}
