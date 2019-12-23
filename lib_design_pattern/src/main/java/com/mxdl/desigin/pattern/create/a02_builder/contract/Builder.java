package com.mxdl.desigin.pattern.create.a02_builder.contract;

/**
 * Description: <Builder><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public abstract class Builder {
    public Builder() {
        mProduct = new Product();
    }

    protected Product mProduct;

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product build() {
        return mProduct;
    }
}
