package com.mxdl.desigin.pattern.structure.a06_bridge.entity;

import com.mxdl.desigin.pattern.structure.a06_bridge.contract.IPhoneSoftware;

/**
 * Description: <XiaoMiSoftware><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class SanXingSoftware implements IPhoneSoftware {
    @Override
    public void crateSoftware() {
        System.out.println("三星软件");
    }
}
