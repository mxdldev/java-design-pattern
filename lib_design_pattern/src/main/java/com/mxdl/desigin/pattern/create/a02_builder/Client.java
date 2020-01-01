package com.mxdl.desigin.pattern.create.a02_builder;

import com.mxdl.desigin.pattern.create.a02_builder.handler.BuilderHandler;
import com.mxdl.desigin.pattern.create.a02_builder.entity.Person;
import com.mxdl.desigin.pattern.create.a02_builder.builder.PersonFatBuilder;
import com.mxdl.desigin.pattern.create.a02_builder.builder.PersonThinBuilder;

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
