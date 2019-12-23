package com.mxdl.desigin.pattern.create.a02_builder;

import com.mxdl.desigin.pattern.create.a02_builder.contract.Builder;

/**
 * Description: <ConcreateBuilderA><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class ConcreateBuilderB extends Builder {
    @Override
    public void buildPartA() {
        mProduct.setA("a1");
    }

    @Override
    public void buildPartB() {
        mProduct.setB("b1");
    }

    @Override
    public void buildPartC() {
        mProduct.setC("c1");
    }

}
