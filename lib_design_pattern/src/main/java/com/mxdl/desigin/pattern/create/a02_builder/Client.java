package com.mxdl.desigin.pattern.create.a02_builder;

import com.mxdl.desigin.pattern.create.a02_builder.contract.Product;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        ConcreateBuilderA concreateBuilderA = new ConcreateBuilderA();
        ConcreateBuilderB concreateBuilderB = new ConcreateBuilderB();
        BuilderDirecter directer = new BuilderDirecter();
        Product productA = directer.createProduct(concreateBuilderA);
        Product productB = directer.createProduct(concreateBuilderB);
        System.out.println(productA.toString());
        System.out.println(productB.toString());
    }
}
