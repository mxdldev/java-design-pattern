package com.mxdl.desigin.pattern.structure.a02_proxy.entity;

import com.mxdl.desigin.pattern.structure.a02_proxy.contract.IGame;

/**
 * Description: <GamePlayer><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class GamePlayer implements IGame {
    @Override
    public void login() {
        System.out.println("GamePlayer start login...");
    }

    @Override
    public void palyer() {
        System.out.println("GamePlayer start palyer...");
    }
}
