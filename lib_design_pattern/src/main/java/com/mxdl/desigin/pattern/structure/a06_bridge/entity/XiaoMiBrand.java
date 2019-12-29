package com.mxdl.desigin.pattern.structure.a06_bridge.entity;

import com.mxdl.desigin.pattern.structure.a06_bridge.contract.APhoneBrand;
import com.mxdl.desigin.pattern.structure.a06_bridge.contract.IPhoneSoftware;

/**
 * Description: <XiaoMiBrand><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class XiaoMiBrand extends APhoneBrand {
    public XiaoMiBrand(IPhoneSoftware software) {
        super(software);
    }

    @Override
    public void createBrnad() {
        System.out.println("小米手机");
    }
}
