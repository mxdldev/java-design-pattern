package com.mxdl.desigin.pattern.behavior.a02_strategy;

import com.mxdl.desigin.pattern.behavior.a02_strategy.entity.AddOperate;
import com.mxdl.desigin.pattern.behavior.a02_strategy.entity.SubOperate;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new AddOperate());
        int operate = context.operate(12, 1);
        System.out.println(operate);

        context.setOperate(new SubOperate());
        int operate1 = context.operate(12, 1);
        System.out.println(operate1);

    }
}
