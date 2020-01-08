package com.mxdl.desigin.pattern.behavior.a10_mediator;

import com.mxdl.desigin.pattern.behavior.a10_mediator.entity.Usa;
import com.mxdl.desigin.pattern.behavior.a10_mediator.entity.Irap;
import com.mxdl.desigin.pattern.behavior.a10_mediator.entity.UN;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        UN un = new UN();
        Usa usa = new Usa(un);
        Irap irap = new Irap(un);
        un.setUsa(usa);
        un.setIrap(irap);
        usa.sendMessage("不要研究核武器，否则将发生战争");
        irap.sendMessage("我们没有研究核武器，我们也不怕侵略");
    }
}
