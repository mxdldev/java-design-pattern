package com.mxdl.desigin.pattern.structure.a02_proxy;

import com.mxdl.desigin.pattern.structure.a02_proxy.contract.Subject;

/**
 * Description: <Proxy><br>
 * Author:      mxdl<br>
 * Date:        2019/12/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Proxy implements Subject {
    private RealSubject mRealSubject;
    public Proxy(){
        mRealSubject = new RealSubject();
    }
    @Override
    public void request() {
        mRealSubject.request();
    }
}
