package com.mxdl.desigin.pattern.behavior.a07_expain.entity;

import com.mxdl.desigin.pattern.behavior.a07_expain.contract.IExplain;

/**
 * Description: <NumberExpain><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class NumberExpain implements IExplain {
    private int value;

    public NumberExpain(int value) {
        this.value = value;
    }

    @Override
    public int explain() {
        return value;
    }
}
