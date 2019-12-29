package com.mxdl.desigin.pattern.structure.a01_adapter.entity;

import com.mxdl.desigin.pattern.structure.a01_adapter.contract.APlayer;

/**
 * Description: <QiaoDan><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class KeBi extends APlayer {

    public KeBi(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("KeBi start attack...");
    }

    @Override
    public void defense() {
        System.out.println("KeBi start defense...");
    }
}
