package com.mxdl.desigin.pattern.behavior.mediator.entity;

import com.mxdl.desigin.pattern.behavior.mediator.contract.IColleague;
import com.mxdl.desigin.pattern.behavior.mediator.contract.IMediator;

/**
 * Description: <ConcreateColleagueA><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class ConcreateColleagueA implements IColleague {
    IMediator mMediator;

    public ConcreateColleagueA(IMediator mediator) {
        mMediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("同事A要发消息了");
        mMediator.sendMessage(message,this);
    }

    @Override
    public void notifyMessage(String messaege) {
        System.out.println("同事A收到了消息："+messaege);
    }
}
