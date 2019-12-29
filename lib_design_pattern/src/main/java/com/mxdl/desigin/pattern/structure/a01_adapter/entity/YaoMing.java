package com.mxdl.desigin.pattern.structure.a01_adapter.entity;

import com.mxdl.desigin.pattern.structure.a01_adapter.contract.APlayer;

/**
 * Description: <YaoMing><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class YaoMing {
    private String name;

    public YaoMing(String name) {
        this.name = name;
    }

    public void chinaAttack() {
        System.out.println("YaoMing start attack...");
    }

    public void chinaDefense() {
        System.out.println("YaoMing start defense...");
    }
}
