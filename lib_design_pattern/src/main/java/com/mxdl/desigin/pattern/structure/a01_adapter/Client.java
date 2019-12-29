package com.mxdl.desigin.pattern.structure.a01_adapter;

import com.mxdl.desigin.pattern.structure.a01_adapter.entity.KeBi;
import com.mxdl.desigin.pattern.structure.a01_adapter.entity.QiaoDan;
import com.mxdl.desigin.pattern.structure.a01_adapter.entity.TranslaterAdapter;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        QiaoDan qiaoDan = new QiaoDan("QiaoDan");
        KeBi keBi = new KeBi("KeBi");

        qiaoDan.attack();
        keBi.defense();

        TranslaterAdapter translaterAdapter = new TranslaterAdapter("TranslaterAdapter");
        translaterAdapter.defense();
    }
}
