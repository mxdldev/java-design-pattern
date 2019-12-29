package com.mxdl.desigin.pattern.structure.a02_proxy.entity;

import com.mxdl.desigin.pattern.structure.a02_proxy.contract.IGame;

/**
 * Description: <GamePoxy><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class GamePoxy implements IGame {
    private IGame mGame;

    public GamePoxy(IGame game) {
        this.mGame = game;
    }

    @Override
    public void login() {
        mGame.login();
    }

    @Override
    public void palyer() {
        mGame.palyer();
    }
}
