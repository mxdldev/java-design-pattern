package com.mxdl.desigin.pattern.create.a06_prototype;

import com.mxdl.desigin.pattern.create.a06_prototype.contract.APerson;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        PrototypePerson prototypePerson = new PrototypePerson("张三",18);
        System.out.println(prototypePerson.toString());
        APerson aPerson = prototypePerson.clonePerson();
        prototypePerson.setName("李四");
        prototypePerson.setAge(16);

        System.out.println(prototypePerson.toString());
        System.out.println(aPerson.toString());
    }
}
