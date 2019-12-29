package com.mxdl.desigin.pattern.behavior.a07_expain;

import com.mxdl.desigin.pattern.behavior.a07_expain.entity.AddExplain;
import com.mxdl.desigin.pattern.behavior.a07_expain.entity.MulExplain;
import com.mxdl.desigin.pattern.behavior.a07_expain.entity.NumberExpain;
import com.mxdl.desigin.pattern.behavior.a07_expain.entity.SubExplain;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
    //    2+4*2-3
        NumberExpain expain2 = new NumberExpain(2);
        NumberExpain expain4 = new NumberExpain(4);
        NumberExpain expain3 = new NumberExpain(3);

        MulExplain mulExplain = new MulExplain(expain2,expain4);
        AddExplain addExplain = new AddExplain(expain2,mulExplain);
        SubExplain subExplain = new SubExplain(addExplain,expain3);
        int explain = subExplain.explain();
        System.out.println(explain);
    }
}
