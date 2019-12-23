package com.mxdl.desigin.pattern.create.a04_abstract_factory.entity;

/**
 * Description: <YellowPerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class WhiteManPerson extends WhitePerson {
    @Override
    public void eat() {
        System.out.println("WhiteManPerson eat");
    }

    @Override
    public void sleep() {
        System.out.println("WhiteManPerson sleep");
    }

    @Override
    public void study() {
        System.out.println("WhiteManPerson study");
    }
}
