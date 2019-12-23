package com.mxdl.desigin.pattern.create.a04_abstract_factory.contract;

/**
 * Description: <IPersonFactory><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public interface IPersonFactory {
    IPerson createWhitePersonFactory();
    IPerson createBlackPersonFactory();
    IPerson createYellowPersonFactory();
}
