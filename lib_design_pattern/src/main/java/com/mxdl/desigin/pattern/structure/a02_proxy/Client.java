package com.mxdl.desigin.pattern.structure.a02_proxy;

import com.mxdl.desigin.pattern.structure.a02_proxy.entity.GamePlayer;
import com.mxdl.desigin.pattern.structure.a02_proxy.entity.GamePoxy;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        GamePoxy gamePoxy = new GamePoxy(new GamePlayer());
        gamePoxy.login();
        gamePoxy.palyer();
    }
}
