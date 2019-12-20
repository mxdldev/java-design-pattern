package com.mxdl.desigin.pattern.structure.Observer;

import java.util.Observable;

/**
 * Description: <MyObserverable><br>
 * Author:      mxdl<br>
 * Date:        2019/12/19<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class MyObserverable extends Observable {
    void update(){
        setChanged();
        notifyObservers();
    }
}
