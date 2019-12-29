package com.mxdl.desigin.pattern.create.a01_single_instance;

/**
 * Description: <推荐的单例模式><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Singleton2 {

    public static Singleton2 getSingleton() {
        return SingletonHelpter.singleton;
    }

    static class SingletonHelpter {
        public static Singleton2 singleton = new Singleton2();
    }
}
