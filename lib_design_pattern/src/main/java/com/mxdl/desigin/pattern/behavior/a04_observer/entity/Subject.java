package com.mxdl.desigin.pattern.behavior.a04_observer.entity;

import java.util.Observable;

/**
 * Description: <Subject><br>
 * Author:      mxdl<br>
 * Date:        2019/12/19<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Subject extends Observable {
    public void update(){
        setChanged();
        notifyObservers();
    }
}
