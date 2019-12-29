package com.mxdl.desigin.pattern.structure.a06_bridge.contract;

/**
 * Description: <APhoneBrand><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public abstract class APhoneBrand {
    protected IPhoneSoftware mSoftware;

    public APhoneBrand(IPhoneSoftware software) {
        mSoftware = software;
    }

    public abstract void createBrnad();
    public void createSoftWare() {
        mSoftware.crateSoftware();
    }
}
