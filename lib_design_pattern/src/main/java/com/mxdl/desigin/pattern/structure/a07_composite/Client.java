package com.mxdl.desigin.pattern.structure.a07_composite;

import com.mxdl.desigin.pattern.structure.a07_composite.entity.Composite;
import com.mxdl.desigin.pattern.structure.a07_composite.entity.Leaf;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Composite root = new Composite();
        Composite composite = new Composite();
        Composite composite1 = new Composite();

        composite.addNode(leaf);
        composite.addNode(leaf1);
        composite1.addNode(leaf2);

        root.addNode(composite);
        root.addNode(composite1);
    }
}
