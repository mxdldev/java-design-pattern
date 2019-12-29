package com.mxdl.desigin.pattern.create.a03_factory_simple.factory;

import com.mxdl.desigin.pattern.create.a03_factory_simple.contract.IOperate;
import com.mxdl.desigin.pattern.create.a03_factory_simple.entity.OperateAdd;
import com.mxdl.desigin.pattern.create.a03_factory_simple.entity.OperateDiv;
import com.mxdl.desigin.pattern.create.a03_factory_simple.entity.OperateMul;
import com.mxdl.desigin.pattern.create.a03_factory_simple.entity.OperateSub;

/**
 * Description: <SimpleFactory><br>
 * Author:      mxdl<br>
 * Date:        2019/12/18<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class SimpleFactory {
    public static IOperate createOperation(String operate) {
        switch (operate) {
            case "+":
                return new OperateAdd();
            case "-":
                return new OperateSub();
            case "*":
                return new OperateMul();
            case "/":
                return new OperateDiv();
        }
        return null;
    }
}
