package com.mxdl.desigin.pattern.behavior.a09_state.entity;

import com.mxdl.desigin.pattern.behavior.a09_state.contract.IState;

/**
 * Description: <StateClose><br>
 * Author:      mxdl<br>
 * Date:        2019/12/26<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class StateOpen implements IState {
    @Override
    public void onPress(Light light) {
        System.out.println("打开状态");
        light.setIState(new StateClose());
    }
}

