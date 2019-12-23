package com.mxdl.desigin.pattern.create.a03_factory_method;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        AddFactory addFactory1 = new AddFactory();
        Operate operate = addFactory1.createOperate();
        operate.setLeft(11);
        operate.setRight(33);
        int operate1 = operate.operate();

        SubFactory subFactory = new SubFactory();
        Operate operate2 = subFactory.createOperate();
        operate.setRight(10);
        operate.setLeft(15);
        int operate3 = operate2.operate();
    }
}
