package com.mxdl.desigin.pattern.behavior.Observer;

import java.util.Observable;

/**
 * Description: <ConcreateObserverable><br>
 * Author:      mxdl<br>
 * Date:        2019/12/19<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class ConcreateObserverable extends Observable {
    void update(){
        setChanged();
        notifyObservers();
    }
}
