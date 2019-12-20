package com.mxdl.desigin.pattern.behavior.vistor.vistor;

import com.mxdl.desigin.pattern.behavior.vistor.contract.IVistor;
import com.mxdl.desigin.pattern.behavior.vistor.entity.Man;
import com.mxdl.desigin.pattern.behavior.vistor.entity.Woman;

/**
 * Description: <SuccVistor><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class FailVistor implements IVistor {
    @Override
    public void processManState(Man man) {
        System.out.println("失败状态：" + man.getName() + "低头喝闷酒");
    }

    @Override
    public void processWomanState(Woman woman) {
        System.out.println("失败状态：" + woman.getName() + "两眼泪汪汪");
    }
}
