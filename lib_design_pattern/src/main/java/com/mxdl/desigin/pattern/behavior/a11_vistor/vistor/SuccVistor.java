package com.mxdl.desigin.pattern.behavior.a11_vistor.vistor;

import com.mxdl.desigin.pattern.behavior.a11_vistor.contract.IVistor;
import com.mxdl.desigin.pattern.behavior.a11_vistor.entity.Man;
import com.mxdl.desigin.pattern.behavior.a11_vistor.entity.Woman;

/**
 * Description: <SuccVistor><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class SuccVistor implements IVistor {
    @Override
    public void processManState(Man man) {
        System.out.println("成功状态：" + man.getName() + "成功男人背后都有一个伟大的女人");
    }

    @Override
    public void processWomanState(Woman woman) {
        System.out.println("成功状态：" + woman.getName() + "成功女人背后都有一个失败的男人");
    }
}
