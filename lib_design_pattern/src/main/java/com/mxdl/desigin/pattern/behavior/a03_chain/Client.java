package com.mxdl.desigin.pattern.behavior.a03_chain;

import com.mxdl.desigin.pattern.behavior.a03_chain.entity.BigLeader;
import com.mxdl.desigin.pattern.behavior.a03_chain.entity.MiddleLeader;
import com.mxdl.desigin.pattern.behavior.a03_chain.entity.SmallLeader;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        BigLeader bigLeader = new BigLeader(null);
        MiddleLeader middleLeader = new MiddleLeader(bigLeader);
        SmallLeader smallLeader = new SmallLeader(middleLeader);
        smallLeader.request(10);
    }
}
