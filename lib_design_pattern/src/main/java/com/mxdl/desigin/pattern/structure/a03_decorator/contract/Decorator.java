package com.mxdl.desigin.pattern.structure.a03_decorator.contract;

/**
 * Description: <Decorator><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public abstract class Decorator implements Component{
    protected Component mComponent;
    public abstract void newOperate();

    public Decorator(Component component) {
        mComponent = component;
    }
}
