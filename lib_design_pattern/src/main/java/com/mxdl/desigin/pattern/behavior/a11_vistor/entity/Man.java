package com.mxdl.desigin.pattern.behavior.a11_vistor.entity;

import com.mxdl.desigin.pattern.behavior.a11_vistor.contract.APerson;
import com.mxdl.desigin.pattern.behavior.a11_vistor.contract.IVistor;

/**
 * Description: <Man><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Man extends APerson {
    public Man(String name) {
        super(name);
    }

    @Override
    public void accept(IVistor vistor) {
        vistor.processManState(this);
    }

}
