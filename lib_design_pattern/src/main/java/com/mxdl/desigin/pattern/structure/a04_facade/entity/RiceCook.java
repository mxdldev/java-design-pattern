package com.mxdl.desigin.pattern.structure.a04_facade.entity;

import com.mxdl.desigin.pattern.structure.a04_facade.contract.ICook;

/**
 * Description: <NoodleCook><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class RiceCook implements ICook {
    @Override
    public void cooking() {
        System.out.println("炒菜米饭");
    }
}
