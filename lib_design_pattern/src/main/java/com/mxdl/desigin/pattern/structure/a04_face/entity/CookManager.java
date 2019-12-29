package com.mxdl.desigin.pattern.structure.a04_face.entity;

/**
 * Description: <CookManager><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class CookManager {
    private RiceCook mRiceCook;
    private NoodleCook mNoodleCook;

    public CookManager(RiceCook riceCook, NoodleCook noodleCook) {
        mRiceCook = riceCook;
        mNoodleCook = noodleCook;
    }
    public void cookRice(){
        mRiceCook.cooking();
    }
    public void cookNoodle(){
        mNoodleCook.cooking();
    }
}
