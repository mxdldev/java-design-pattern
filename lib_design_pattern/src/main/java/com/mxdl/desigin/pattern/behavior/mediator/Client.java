package com.mxdl.desigin.pattern.behavior.mediator;

import com.mxdl.desigin.pattern.behavior.mediator.entity.ConcreateColleagueA;
import com.mxdl.desigin.pattern.behavior.mediator.entity.ConcreateColleagueB;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        ConcreateMediator mediator = new ConcreateMediator();
        ConcreateColleagueA colleagueA = new ConcreateColleagueA(mediator);
        ConcreateColleagueB colleagueB = new ConcreateColleagueB(mediator);
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);
        colleagueA.sendMessage("吃饭了吗？");
        colleagueB.sendMessage("没有啊，难道你要请客？");
    }

}
