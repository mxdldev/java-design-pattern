package com.mxdl.desigin.pattern.create.a02_builder;

import com.mxdl.desigin.pattern.create.a02_builder.contract.Builder;
import com.mxdl.desigin.pattern.create.a02_builder.contract.Product;

/**
 * Description: <BuilderDirecter><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class BuilderDirecter {
    public Product createProduct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.build();
    }
}
