package com.mxdl.desigin.pattern.create.a04_factory_method.contract;

/**
 * Description: <IOperateFactory><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public interface IOperateFactory {
    IOperate createOperate();
}
