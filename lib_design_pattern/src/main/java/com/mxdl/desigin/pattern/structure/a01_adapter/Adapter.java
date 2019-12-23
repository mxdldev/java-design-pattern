package com.mxdl.desigin.pattern.structure.a01_adapter;

import com.mxdl.desigin.pattern.structure.a01_adapter.contract.Target;

/**
 * Description: <Adapter><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Adapter implements Target {
    private Adaptee mAdaptee = new Adaptee();
    @Override
    public void request() {
        mAdaptee.specificRuest();
    }
}
