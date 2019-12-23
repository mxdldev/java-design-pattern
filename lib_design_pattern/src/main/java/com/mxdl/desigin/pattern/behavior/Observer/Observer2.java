package com.mxdl.desigin.pattern.behavior.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Description: <Observer1><br>
 * Author:      mxdl<br>
 * Date:        2019/12/19<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Observer2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("update 2 start...");
    }
}
