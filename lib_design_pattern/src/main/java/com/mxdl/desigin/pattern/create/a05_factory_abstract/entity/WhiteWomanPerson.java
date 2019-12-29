package com.mxdl.desigin.pattern.create.a05_factory_abstract.entity;

/**
 * Description: <YellowPerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class WhiteWomanPerson extends WhitePerson {
    @Override
    public void eat() {
        System.out.println("WhiteWomanPerson eat");
    }

    @Override
    public void sleep() {
        System.out.println("WhiteWomanPerson sleep");
    }

    @Override
    public void study() {
        System.out.println("WhiteWomanPerson study");
    }
}
