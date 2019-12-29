package com.mxdl.desigin.pattern.structure.a07_composite.entity;

import com.mxdl.desigin.pattern.structure.a07_composite.contract.INode;

import java.util.ArrayList;

/**
 * Description: <Composite><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Composite implements INode {
    private ArrayList<INode> mChildList = new ArrayList<>();

    @Override
    public void addNode(INode node) {
        mChildList.add(node);
    }

    @Override
    public void removeNode(INode node) {
        mChildList.remove(node);
    }

    public ArrayList<INode> getChildList() {
        return mChildList;
    }
}
