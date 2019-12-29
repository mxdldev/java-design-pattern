package com.mxdl.desigin.pattern.behavior.a08_command.entity;

import com.mxdl.desigin.pattern.behavior.a08_command.contract.ITv;

/**
 * Description: <TV><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class TV implements ITv {
    @Override
    public void turnOn() {
        System.out.println("TV turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turnOff");
    }

    @Override
    public void changeChannel() {
        System.out.println("TV changeChannel");
    }
}
