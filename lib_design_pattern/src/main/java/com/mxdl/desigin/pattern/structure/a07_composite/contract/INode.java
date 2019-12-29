package com.mxdl.desigin.pattern.structure.a07_composite.contract;

/**
 * Description: <INode><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public interface INode {
    void addNode(INode node);
    void removeNode(INode node);
}
