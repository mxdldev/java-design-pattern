package com.mxdl.desigin.pattern.create.a04_factory_method.entity;

import com.mxdl.desigin.pattern.create.a04_factory_method.contract.IOperate;

/**
 * Description: <OperateAdd><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class OperateSub implements IOperate {

    @Override
    public int operate(int left, int right) {
        return left - right;
    }
}
