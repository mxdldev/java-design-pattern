package com.mxdl.desigin.pattern.structure.a01_adapter;

import com.mxdl.desigin.pattern.structure.a01_adapter.contract.Target;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
