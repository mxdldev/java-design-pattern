package com.mxdl.desigin.pattern.behavior.a09_state;
import com.mxdl.desigin.pattern.behavior.a09_state.entity.Light;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/26<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        light.onPress();
        light.onPress();
        light.onPress();
        light.onPress();
        light.onPress();
    }
}
