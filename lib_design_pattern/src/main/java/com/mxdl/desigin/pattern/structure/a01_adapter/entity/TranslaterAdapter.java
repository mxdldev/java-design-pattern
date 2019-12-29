package com.mxdl.desigin.pattern.structure.a01_adapter.entity;

import com.mxdl.desigin.pattern.structure.a01_adapter.contract.APlayer;

/**
 * Description: <TranslaterAdapter><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class TranslaterAdapter extends APlayer {
    private YaoMing mYaoMing;
    public TranslaterAdapter(String name) {
        super(name);
       mYaoMing = new YaoMing("YaoMing");
    }

    @Override
    public void attack() {
        mYaoMing.chinaAttack();
    }

    @Override
    public void defense() {
        mYaoMing.chinaDefense();
    }
}
