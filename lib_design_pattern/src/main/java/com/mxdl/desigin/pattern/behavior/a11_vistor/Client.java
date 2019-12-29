package com.mxdl.desigin.pattern.behavior.a11_vistor;

import com.mxdl.desigin.pattern.behavior.a11_vistor.entity.Man;
import com.mxdl.desigin.pattern.behavior.a11_vistor.entity.Woman;
import com.mxdl.desigin.pattern.behavior.a11_vistor.vistor.FailVistor;
import com.mxdl.desigin.pattern.behavior.a11_vistor.vistor.SuccVistor;

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
