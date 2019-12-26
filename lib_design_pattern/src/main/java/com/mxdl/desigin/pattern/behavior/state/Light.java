package com.mxdl.desigin.pattern.behavior.state;

/**
 * Description: <Light><br>
 * Author:      mxdl<br>
 * Date:        2019/12/26<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Light {
    private State state;
    public Light(){
        state = new StateClose();
    }
    void onPress(){
        state.onPress(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
