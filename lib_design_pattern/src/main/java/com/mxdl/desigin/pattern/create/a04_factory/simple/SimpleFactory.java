package com.mxdl.desigin.pattern.create.a04_factory.simple;

/**
 * Description: <SimpleFactory><br>
 * Author:      mxdl<br>
 * Date:        2019/12/18<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class SimpleFactory {
    public static Operation createOperation(String operate) {
        switch (operate) {
            case "+":
                return new OperationAdd();
            case "-":
                return new OperationSub();
            case "*":
                return new OperationMul();
            case "/":
                return new OperationDiv();
        }
        return null;
    }
}
