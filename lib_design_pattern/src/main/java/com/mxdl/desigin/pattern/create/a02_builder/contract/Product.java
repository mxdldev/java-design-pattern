package com.mxdl.desigin.pattern.create.a02_builder.contract;

/**
 * Description: <Operate><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Product {
    private String a;
    private String b;
    private String c;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Operate{" + "a='" + a + '\'' + ", b='" + b + '\'' + ", c='" + c + '\'' + '}';
    }
}
