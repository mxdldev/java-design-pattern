package com.mxdl.desigin.pattern.behavior.a08_command.contract;

/**
 * Description: <ACommand><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public abstract class ACommand {
    protected ITv tv;

    public ACommand(ITv ITv) {
        tv = ITv;
    }

    public abstract void exeCommand();
}
