package com.mxdl.desigin.pattern.structure.a03_decorator.entity;

import com.mxdl.desigin.pattern.structure.a03_decorator.contract.IPerson;

/**
 * Description: <APerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Person implements IPerson {
    @Override
    public void eat() {
        System.out.println("开始吃饭");
    }
}
