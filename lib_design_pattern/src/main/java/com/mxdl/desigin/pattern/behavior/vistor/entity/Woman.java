package com.mxdl.desigin.pattern.behavior.vistor.entity;

import com.mxdl.desigin.pattern.behavior.vistor.contract.Person;
import com.mxdl.desigin.pattern.behavior.vistor.contract.IVistor;

/**
 * Description: <Woman><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Woman extends Person {
    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(IVistor vistor) {
        vistor.processWomanState(this);
    }
}
