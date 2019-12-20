package com.mxdl.desigin.pattern.behavior.vistor;

import com.mxdl.desigin.pattern.behavior.vistor.entity.Man;
import com.mxdl.desigin.pattern.behavior.vistor.entity.Woman;
import com.mxdl.desigin.pattern.behavior.vistor.vistor.FailVistor;
import com.mxdl.desigin.pattern.behavior.vistor.vistor.SuccVistor;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        Man man = new Man("zhang san");
        Woman woman = new Woman("li si");
        SuccVistor succVistor = new SuccVistor();
        FailVistor failVistor = new FailVistor();

        man.accept(succVistor);
        woman.accept(succVistor);

        man.accept(failVistor);
        woman.accept(failVistor);
    }
}
