package com.mxdl.desigin.pattern.structure.a06_bridge;

import com.mxdl.desigin.pattern.structure.a06_bridge.entity.SanXingBrand;
import com.mxdl.desigin.pattern.structure.a06_bridge.entity.SanXingSoftware;
import com.mxdl.desigin.pattern.structure.a06_bridge.entity.XiaoMiBrand;
import com.mxdl.desigin.pattern.structure.a06_bridge.entity.XiaoMiSoftware;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        XiaoMiBrand xiaoMiBrand = new XiaoMiBrand(new XiaoMiSoftware());
        xiaoMiBrand.createBrnad();
        xiaoMiBrand.createSoftWare();

        SanXingBrand sanXingBrand = new SanXingBrand(new SanXingSoftware());
        sanXingBrand.createBrnad();
        sanXingBrand.createSoftWare();
    }
}
