package com.mxdl.desigin.pattern.create.a05_prototype;

import androidx.annotation.NonNull;

/**
 * Description: <ConcreatePrototype><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class ConcreatePrototype implements Cloneable {
    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
