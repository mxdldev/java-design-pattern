package com.mxdl.desigin.pattern.behavior.mediator.contract;

import com.mxdl.desigin.pattern.behavior.mediator.contract.IColleague;

/**
 * Description: <IMediator><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public interface IMediator {
    void sendMessage(String msg, IColleague colleague);
}
