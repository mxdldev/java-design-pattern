package com.mxdl.desigin.pattern.behavior.state;

import com.mxdl.desigin.pattern.behavior.state.test.MyLight;

/**
 * Description: <Test><br>
 * Author:      mxdl<br>
 * Date:        2019/12/26<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Test {
    public static void main(String[] args) {
//        Light light = new Light();
////        light.onPress();
////        light.onPress();
////        light.onPress();
        MyLight myLight = new MyLight();
        myLight.onPress();
        myLight.onPress();
        myLight.onPress();
    }
}
