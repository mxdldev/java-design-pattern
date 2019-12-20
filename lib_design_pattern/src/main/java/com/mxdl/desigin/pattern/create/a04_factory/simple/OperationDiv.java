package com.mxdl.desigin.pattern.create.a04_factory.simple;

/**
 * Description: <OperationAdd><br>
 * Author:      mxdl<br>
 * Date:        2019/12/18<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class OperationDiv implements Operation {
    @Override
    public int calculate(int a, int b){
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
