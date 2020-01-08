package com.mxdl.desigin.pattern.create.a06_prototype.prototype;

import com.mxdl.desigin.pattern.create.a06_prototype.entity.CopyPerson;
import com.mxdl.desigin.pattern.create.a06_prototype.contract.APerson;

/**
 * Description: <PrototypePerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class PrototypePerson extends APerson {
    public PrototypePerson(String name, int age) {
        super(name, age);
    }
    public APerson clonePerson(){
        CopyPerson copyPerson = new CopyPerson();
        copyPerson.setName(getName());
        copyPerson.setAge(getAge());
        return copyPerson;
    }
}
