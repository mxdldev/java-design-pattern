package com.mxdl.desigin.pattern.behavior.a10_mediator.entity;

import com.mxdl.desigin.pattern.behavior.a10_mediator.contract.ICountry;
import com.mxdl.desigin.pattern.behavior.a10_mediator.contract.IUN;

/**
 * Description: <UN><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class UN implements IUN {
    private Usa mUsa;
    private Irap mIrap;

    public void setUsa(Usa usa) {
        mUsa = usa;
    }

    public void setIrap(Irap irap) {
        mIrap = irap;
    }

    @Override
    public void sendMessage(String msg, ICountry country) {
        if(country == mUsa){
            mIrap.notifyMessage(msg);
        }else if(country == mIrap){
            mUsa.notifyMessage(msg);
        }
    }
}
