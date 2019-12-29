package com.mxdl.desigin.pattern.behavior.a02_strategy.entity;

import com.mxdl.desigin.pattern.behavior.a02_strategy.contract.IOperate;

/**
 * Description: <SubOperate><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class SubOperate implements IOperate {
    @Override
    public int operate(int left, int right) {
        return left-right;
    }
}
