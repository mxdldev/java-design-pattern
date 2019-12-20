package com.mxdl.desigin.pattern.behavior.mediator;

/**
 * Description: <Mediator><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public interface Mediator {
    void sendMessage(String msg,Colleague colleague);
}
