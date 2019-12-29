package com.mxdl.desigin.pattern.create.a02_builder;

import com.designmode.create.t04_builder.PersonBuilder;
import com.mxdl.desigin.pattern.create.a02_builder.entity.BuilderHandler;
import com.mxdl.desigin.pattern.create.a02_builder.entity.Person;
import com.mxdl.desigin.pattern.create.a02_builder.entity.PersonFatBuilder;
import com.mxdl.desigin.pattern.create.a02_builder.entity.PersonThinBuilder;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        PersonFatBuilder personFatBuilder = new PersonFatBuilder();
        PersonThinBuilder personThinBuilder = new PersonThinBuilder();
        BuilderHandler builderHandler = new BuilderHandler();
        Person fatPerson = builderHandler.createPerson(personFatBuilder);
        Person thinPerson = builderHandler.createPerson(personThinBuilder);
    }
}
