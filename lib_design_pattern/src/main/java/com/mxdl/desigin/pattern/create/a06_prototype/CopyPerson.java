package com.mxdl.desigin.pattern.create.a06_prototype;

import com.mxdl.desigin.pattern.create.a06_prototype.contract.APerson;

/**
 * Description: <CopyPerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class CopyPerson extends APerson {
    public CopyPerson(String name, int age) {
        super(name, age);
    }
    public CopyPerson() {
        super(null,0);
    }
}
