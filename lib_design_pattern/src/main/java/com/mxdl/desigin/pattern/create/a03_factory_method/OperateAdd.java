package com.mxdl.desigin.pattern.create.a03_factory_method;

/**
 * Description: <OperateAdd><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class OperateAdd extends Operate {

    @Override
    protected int operate() {
        return left + right;
    }
}
