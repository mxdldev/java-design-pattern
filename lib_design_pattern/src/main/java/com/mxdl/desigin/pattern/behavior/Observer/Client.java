package com.mxdl.desigin.pattern.behavior.Observer;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/19<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        ConcreateObserverable observerable = new ConcreateObserverable();
        observerable.addObserver(observer1);
        observerable.addObserver(observer2);
        observerable.update();
    }
}
