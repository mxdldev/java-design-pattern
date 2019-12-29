package com.mxdl.desigin.pattern.create.a04_factory_method;

import com.mxdl.desigin.pattern.create.a04_factory_method.contract.IOperate;
import com.mxdl.desigin.pattern.create.a04_factory_method.factory.AddFactoryI;
import com.mxdl.desigin.pattern.create.a04_factory_method.factory.SubFactoryI;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        IOperate addPerrate = new AddFactoryI().createOperate();
        int operate1 = addPerrate.operate(12, 22);
        System.out.println("计算结果："+operate1);

        IOperate IOperate = new SubFactoryI().createOperate();
        int operate2 = IOperate.operate(12, 2);
        System.out.println("计算结果1："+operate2);

    }
}
