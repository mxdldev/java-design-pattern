package com.mxdl.desigin.pattern.create.a03_factory_simple;

import com.mxdl.desigin.pattern.create.a03_factory_simple.contract.IOperate;
import com.mxdl.desigin.pattern.create.a03_factory_simple.factory.SimpleFactory;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        IOperate operation = SimpleFactory.createOperation("+");
        int operate = operation.operate(12, 3);
        System.out.println("计算结果："+operate);
    }
}
