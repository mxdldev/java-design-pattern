package com.mxdl.desigin.pattern.behavior.a09_state.contract;

import com.mxdl.desigin.pattern.behavior.a09_state.entity.Light;

/**
 * Description: <IState><br>
 * Author:      mxdl<br>
 * Date:        2019/12/26<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public interface IState {
    void onPress(Light light);
}

