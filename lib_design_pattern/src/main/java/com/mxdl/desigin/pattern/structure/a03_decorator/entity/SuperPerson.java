package com.mxdl.desigin.pattern.structure.a03_decorator.entity;

import com.mxdl.desigin.pattern.structure.a03_decorator.contract.IPerson;

/**
 * Description: <SuperPerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class SuperPerson implements IPerson {
    private Person mPerson;

    public SuperPerson(Person person) {
        mPerson = person;
    }

    @Override
    public void eat() {
        System.out.println("喝一杯...");
        mPerson.eat();
        System.out.println("抽一根...");
    }
}
