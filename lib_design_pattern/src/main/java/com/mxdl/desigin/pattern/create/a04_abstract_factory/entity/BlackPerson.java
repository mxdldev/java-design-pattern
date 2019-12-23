package com.mxdl.desigin.pattern.create.a04_abstract_factory.entity;

import com.mxdl.desigin.pattern.create.a04_abstract_factory.contract.IPerson;

/**
 * Description: <YellowPerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class BlackPerson implements IPerson {
    @Override
    public void eat() {
        System.out.println("BlackPerson eat");
    }

    @Override
    public void sleep() {
        System.out.println("BlackPerson sleep");
    }

    @Override
    public void study() {
        System.out.println("BlackPerson study");
    }
}
