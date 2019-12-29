package com.mxdl.desigin.pattern.create.a05_factory_abstract.entity;

import com.mxdl.desigin.pattern.create.a05_factory_abstract.contract.IPerson;

/**
 * Description: <YellowPerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class WhitePerson implements IPerson {
    @Override
    public void eat() {
        System.out.println("WhitePerson eat");
    }

    @Override
    public void sleep() {
        System.out.println("WhitePerson sleep");
    }

    @Override
    public void study() {
        System.out.println("WhitePerson study");
    }
}
