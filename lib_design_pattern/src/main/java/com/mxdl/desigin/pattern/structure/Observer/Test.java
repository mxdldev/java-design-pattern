package com.mxdl.desigin.pattern.structure.Observer;

/**
 * Description: <Test><br>
 * Author:      mxdl<br>
 * Date:        2019/12/19<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Test {
    public static void main(String[] args) {
        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        MyObserverable observerable = new MyObserverable();
        observerable.addObserver(observer1);
        observerable.addObserver(observer2);
        observerable.update();
        System.out.println("ok");
    }
}
