package com.mxdl.desigin.pattern.create.a04_abstract_factory.entity;

/**
 * Description: <YellowPerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class BlackWomanPerson extends BlackPerson {
    @Override
    public void eat() {
        System.out.println("BlackWomanPerson eat");
    }

    @Override
    public void sleep() {
        System.out.println("BlackWomanPerson sleep");
    }

    @Override
    public void study() {
        System.out.println("BlackWomanPerson study");
    }
}
