package com.mxdl.desigin.pattern.behavior.vistor.entity;

import com.mxdl.desigin.pattern.behavior.vistor.contract.Person;
import com.mxdl.desigin.pattern.behavior.vistor.contract.IVistor;

/**
 * Description: <Man><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Man extends Person {
    public Man(String name) {
        super(name);
    }

    @Override
    public void accept(IVistor vistor) {
        vistor.processManState(this);
    }

}
