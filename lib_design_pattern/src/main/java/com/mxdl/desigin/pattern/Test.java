package com.mxdl.desigin.pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Description: <Test><br>
 * Author:      mxdl<br>
 * Date:        2019/12/19<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Test {
    public static void main(String[] args) {
//        String a = "a";
//        String b = "a";
//        if(a == b){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
//        if(a.equals(b)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
        Observable observable = new Observable();

        observable.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("update 1 start...");
            }
        });
        observable.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("update 2 start...");
            }
        });
        System.out.println("update 22 start...");
        observable.notifyObservers("fff");
    }
}
