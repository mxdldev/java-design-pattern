package com.mxdl.desigin.pattern.behavior.a02_strategy;

import com.mxdl.desigin.pattern.behavior.a02_strategy.contract.IOperate;

/**
 * Description: <Context><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Context implements IOperate{
    IOperate mOperate;

    public Context(IOperate operate) {
        mOperate = operate;
    }

    @Override
    public int operate(int left, int right) {
        return mOperate.operate(left,right);
    }

    public void setOperate(IOperate operate) {
        mOperate = operate;
    }
}
