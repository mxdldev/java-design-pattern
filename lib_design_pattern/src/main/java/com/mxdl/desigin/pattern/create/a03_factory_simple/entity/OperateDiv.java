package com.mxdl.desigin.pattern.create.a03_factory_simple.entity;

import com.mxdl.desigin.pattern.create.a03_factory_simple.contract.IOperate;

/**
 * Description: <OperateAdd><br>
 * Author:      mxdl<br>
 * Date:        2019/12/18<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class OperateDiv implements IOperate {
    @Override
    public int operate(int a, int b){
        if(b == 0){
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return a / b;
    }
}
