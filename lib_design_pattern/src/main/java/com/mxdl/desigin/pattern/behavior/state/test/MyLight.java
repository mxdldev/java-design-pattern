package com.mxdl.desigin.pattern.behavior.state.test;

/**
 * Description: <MyLight><br>
 * Author:      mxdl<br>
 * Date:        2019/12/26<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class MyLight {
//    boolean isOpen = false;
//    public void onPress(){
//        if(isOpen){
//            System.out.println("灯打开了");
//            isOpen = false;
//        }else{
//            System.out.println("灯关闭了");
//            isOpen = true;
//        }
//    }
    IState mIState;
    public void onPress(){
        mIState.onPress(this);
    }

    public void setIState(IState IState) {
        mIState = IState;
    }
}
