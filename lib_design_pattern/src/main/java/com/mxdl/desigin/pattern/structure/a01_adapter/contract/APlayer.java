package com.mxdl.desigin.pattern.structure.a01_adapter.contract;

/**
 * Description: <APlayer><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public abstract class APlayer {
    private String name;

    public APlayer(String name) {
        this.name = name;
    }
    public abstract void attack();
    public abstract void defense();
}
