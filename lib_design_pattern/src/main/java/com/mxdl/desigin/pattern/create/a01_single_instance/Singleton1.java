package com.mxdl.desigin.pattern.create.a01_single_instance;

/**
 * Description: <Singleton1><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Singleton1 {
    private static Singleton1 mSingleton;

    public static Singleton1 getInstance() {
        if (mSingleton == null) {
            synchronized (Singleton1.class) {
                if (mSingleton == null) {
                    mSingleton = new Singleton1();
                }
            }
        }
        return mSingleton;
    }
}
