package com.mxdl.desigin.pattern.behavior.state;

/**
 * Description: <StateClose><br>
 * Author:      mxdl<br>
 * Date:        2019/12/26<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class StateClose implements State {
    @Override
    public void onPress(Light light) {
        System.out.println("关闭状态");
        light.setState(new StateOpen());
    }
}
