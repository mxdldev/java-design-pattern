package com.mxdl.desigin.pattern.behavior.a11_vistor.contract;

import com.mxdl.desigin.pattern.behavior.a11_vistor.entity.Man;
import com.mxdl.desigin.pattern.behavior.a11_vistor.entity.Woman;

/**
 * Description: <IVistor><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public interface IVistor {
    void processManState(Man man);
    void processWomanState(Woman woman);
}
