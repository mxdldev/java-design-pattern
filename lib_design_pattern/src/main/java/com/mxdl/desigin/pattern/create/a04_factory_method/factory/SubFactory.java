package com.mxdl.desigin.pattern.create.a04_factory_method.factory;

import com.mxdl.desigin.pattern.create.a04_factory_method.contract.IOperate;
import com.mxdl.desigin.pattern.create.a04_factory_method.contract.IOperateFactory;
import com.mxdl.desigin.pattern.create.a04_factory_method.entity.OperateSub;

/**
 * Description: <SubFactory><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class SubFactory implements IOperateFactory {
    @Override
    public IOperate createOperate() {
        return new OperateSub();
    }
}
