package com.mxdl.desigin.pattern.behavior.a07_expain.entity;

import com.mxdl.desigin.pattern.behavior.a07_expain.contract.IExplain;

/**
 * Description: <AddExplain><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class AddExplain implements IExplain {
    private IExplain left;
    private IExplain right;

    public AddExplain(IExplain left, IExplain right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int explain() {
        return left.explain() + right.explain();
    }
}
