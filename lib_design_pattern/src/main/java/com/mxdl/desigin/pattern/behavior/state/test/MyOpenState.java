package com.mxdl.desigin.pattern.behavior.state.test;

import com.mxdl.desigin.pattern.behavior.state.StateOpen;

/**
 * Description: <MyOpenState><br>
 * Author:      mxdl<br>
 * Date:        2019/12/26<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class MyOpenState implements IState {
    @Override
    public void onPress(MyLight light) {
        System.out.println("灯打开了");
        light.setIState(new MyCloseState());
    }
}
