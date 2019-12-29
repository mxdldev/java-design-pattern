package com.mxdl.desigin.pattern.behavior.a11_vistor.contract;

/**
 * Description: <APerson><br>
 * Author:      mxdl<br>
 * Date:        2019/12/20<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public abstract class APerson {
    private String name;

    protected abstract void accept(IVistor vistor);

    public APerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
