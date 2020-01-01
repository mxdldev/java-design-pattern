package com.mxdl.desigin.pattern.create.a02_builder.handler;

import com.mxdl.desigin.pattern.create.a02_builder.contract.IPersonBuilder;
import com.mxdl.desigin.pattern.create.a02_builder.entity.Person;

/**
 * Description: <BuilderHandler><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class BuilderHandler {
    public Person createPerson(IPersonBuilder builder){
        Person person = new Person();
        String header = builder.createHeader();
        String body = builder.createBody();
        String footer = builder.createFooter();
        person.setHeader(header);
        person.setBody(body);
        person.setFooter(footer);
        System.out.println(person.toString());
        return person;
    }
}
