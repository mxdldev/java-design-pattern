package com.mxdl.desigin.pattern.behavior.a10_mediator.entity;

import com.mxdl.desigin.pattern.behavior.a10_mediator.contract.ICountry;
import com.mxdl.desigin.pattern.behavior.a10_mediator.contract.IUN;

/**
 * Description: <Usa><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Usa implements ICountry {
    IUN mIUN;

    public Usa(IUN IUN) {
        mIUN = IUN;
    }

    @Override
    public void sendMessage(String message) {
        mIUN.sendMessage(message,this);
    }

    @Override
    public void notifyMessage(String messaege) {
        System.out.println("美国收到了消息："+messaege);
    }
}
