package com.mxdl.desigin.pattern.structure.a03_decorator;

import com.mxdl.desigin.pattern.structure.a03_decorator.contract.Component;
import com.mxdl.desigin.pattern.structure.a03_decorator.contract.Decorator;

/**
 * Description: <ConcreateDectorator><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class ConcreateDectorator extends Decorator {

    public ConcreateDectorator(Component component) {
        super(component);
    }

    @Override
    public void newOperate() {

    }

    @Override
    public void operate() {
        //aaa
        mComponent.operate();
        //bbb
    }
}
