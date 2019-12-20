package com.mxdl.desigin.pattern.behavior.mediator;

/**
 * Description: <ConcreateMediator><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class ConcreateMediator implements Mediator {
    private ConcreateColleagueA mColleagueA;
    private ConcreateColleagueB mColleagueB;

    public void setColleagueA(ConcreateColleagueA colleagueA) {
        mColleagueA = colleagueA;
    }

    public void setColleagueB(ConcreateColleagueB colleagueB) {
        mColleagueB = colleagueB;
    }

    @Override
    public void sendMessage(String msg, Colleague colleague) {
        System.out.println("中介开始转发消息");
        if(colleague == mColleagueA){
            //如果是A发来了消息，则把这个消息转发给B
            mColleagueB.notifyMessage(msg);
        }else if(colleague == mColleagueB){
            //如果是B发来了消息，则把这个消息转发给A
            mColleagueA.notifyMessage(msg);
        }
    }
}
