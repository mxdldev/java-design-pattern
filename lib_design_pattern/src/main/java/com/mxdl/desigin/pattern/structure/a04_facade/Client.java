package com.mxdl.desigin.pattern.structure.a04_facade;

import com.mxdl.desigin.pattern.structure.a04_facade.entity.CookManager;
import com.mxdl.desigin.pattern.structure.a04_facade.entity.NoodleCook;
import com.mxdl.desigin.pattern.structure.a04_facade.entity.RiceCook;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        RiceCook riceCook = new RiceCook();
        NoodleCook noodleCook = new NoodleCook();
        CookManager cookManager = new CookManager(riceCook,noodleCook);
        cookManager.cookRice();
        cookManager.cookNoodle();
    }
}
