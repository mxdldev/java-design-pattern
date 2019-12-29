package com.mxdl.desigin.pattern.create.a01_single_instance;

/**
 * Description: <饿汉式单利><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }
}
