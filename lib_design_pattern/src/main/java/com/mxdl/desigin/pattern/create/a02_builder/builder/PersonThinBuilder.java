package com.mxdl.desigin.pattern.create.a02_builder.builder;

import com.mxdl.desigin.pattern.create.a02_builder.contract.IPersonBuilder;

/**
 * Description: <PersonThinBuilder><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class PersonThinBuilder implements IPersonBuilder {
    @Override
    public String createHeader() {
        return "瘦头";
    }

    @Override
    public String createBody() {
        return "瘦腰";
    }

    @Override
    public String createFooter() {
        return "瘦腿";
    }
}
