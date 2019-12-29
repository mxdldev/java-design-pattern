package com.mxdl.desigin.pattern.behavior.a09_state.entity;

import com.mxdl.desigin.pattern.behavior.a09_state.contract.IState;

/**
 * Description: <Light><br>
 * Author:      mxdl<br>
 * Date:        2019/12/26<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Light {
    private IState mIState;
    public Light(){
        mIState = new StateClose();
    }
    public void onPress(){
        mIState.onPress(this);
    }

    public void setIState(IState IState) {
        this.mIState = IState;
    }
}
