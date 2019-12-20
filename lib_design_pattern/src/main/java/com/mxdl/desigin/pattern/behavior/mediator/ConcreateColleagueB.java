package com.mxdl.desigin.pattern.behavior.mediator;

/**
 * Description: <ConcreateColleagueA><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class ConcreateColleagueB implements Colleague {
    Mediator mMediator;

    public ConcreateColleagueB(Mediator mediator) {
        mMediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("同事B要发消息了");
        mMediator.sendMessage(message,this);
    }

    @Override
    public void notifyMessage(String messaege) {
        System.out.println("同事B收到了消息："+messaege);
    }
}
