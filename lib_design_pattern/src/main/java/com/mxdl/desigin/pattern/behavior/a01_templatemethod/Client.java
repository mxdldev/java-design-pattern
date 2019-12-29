package com.mxdl.desigin.pattern.behavior.a01_templatemethod;

import com.mxdl.desigin.pattern.behavior.a01_templatemethod.entity.Cat;
import com.mxdl.desigin.pattern.behavior.a01_templatemethod.entity.Dog;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.eat();
        dog.eat();
    }
}
