package com.mxdl.desigin.pattern.create.a03_factory_method.simple;

/**
 * Description: <OperationAdd><br>
 * Author:      mxdl<br>
 * Date:        2019/12/18<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class OperationMul implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
