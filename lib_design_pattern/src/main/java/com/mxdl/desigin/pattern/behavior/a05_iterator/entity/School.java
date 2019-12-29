package com.mxdl.desigin.pattern.behavior.a05_iterator.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: <School><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class School {
    private List<Student> mList = new ArrayList<>();
    private int index = 0;
    public void addStudent(Student student){
        mList.add(student);
    }
    public void removeStudent(Student student){
        mList.remove(student);
    }
    public boolean isHave(){
        if(mList == null ||  mList.size() == 0){
            return false;
        }
        if(index <= mList.size()-1){
            return true;
        }
        return false;
    }
    public Student next(){
       return mList.get(index++);
    }
}
