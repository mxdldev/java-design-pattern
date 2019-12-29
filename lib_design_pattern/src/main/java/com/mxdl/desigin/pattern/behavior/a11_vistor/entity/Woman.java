package com.mxdl.desigin.pattern.behavior.a11_vistor.entity;

import com.mxdl.desigin.pattern.behavior.a11_vistor.contract.APerson;
import com.mxdl.desigin.pattern.behavior.a11_vistor.contract.IVistor;

/**
 * Description: <Woman><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Woman extends APerson {
    public Woman(String name) {
        super(name);
    }

    @Override
    public void accept(IVistor vistor) {
        vistor.processWomanState(this);
    }
}
