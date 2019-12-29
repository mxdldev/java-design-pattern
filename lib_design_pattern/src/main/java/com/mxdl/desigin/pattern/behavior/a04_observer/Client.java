package com.mxdl.desigin.pattern.behavior.a04_observer;

import com.mxdl.desigin.pattern.behavior.a04_observer.entity.Observer1;
import com.mxdl.desigin.pattern.behavior.a04_observer.entity.Observer2;
import com.mxdl.desigin.pattern.behavior.a04_observer.entity.Subject;

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
        Subject subject = new Subject();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.update();
    }
}
