package com.mxdl.desigin.pattern.create.a05_factory_abstract;

import com.mxdl.desigin.pattern.create.a05_factory_abstract.contract.IPerson;
import com.mxdl.desigin.pattern.create.a05_factory_abstract.factory.ManFactory;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        ManFactory manFactory = new ManFactory();
        IPerson whitePerson = manFactory.createWhitePerson();
        IPerson yellowPerson = manFactory.createYellowPerson();
        IPerson blackPerson = manFactory.createBlackPerson();

        whitePerson.eat();
        yellowPerson.eat();
        blackPerson.eat();
    }
}
