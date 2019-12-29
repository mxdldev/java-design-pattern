package com.mxdl.desigin.pattern.behavior.a01_templatemethod.entity;

import com.mxdl.desigin.pattern.behavior.a01_templatemethod.contract.IAnimal;

/**
 * Description: <Cat><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Dog implements IAnimal {

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }
}
