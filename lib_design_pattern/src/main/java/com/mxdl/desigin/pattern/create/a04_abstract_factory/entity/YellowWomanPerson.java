package com.mxdl.desigin.pattern.create.a04_abstract_factory.entity;

/**
 * Description: <YellowWomanPerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class YellowWomanPerson extends YellowPerson {
    @Override
    public void eat() {
        System.out.println("YellowWomanPerson eat");
    }

    @Override
    public void sleep() {
        System.out.println("YellowWomanPerson sleep");
    }

    @Override
    public void study() {
        System.out.println("YellowWomanPerson study");
    }
}
