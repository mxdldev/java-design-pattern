package com.mxdl.desigin.pattern.behavior.a08_command.entity;

import com.mxdl.desigin.pattern.behavior.a08_command.contract.ACommand;
import com.mxdl.desigin.pattern.behavior.a08_command.contract.ITv;

/**
 * Description: <TurnOnCommand><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class TurnOnCommand extends ACommand {
    public TurnOnCommand(ITv ITv) {
        super(ITv);
    }

    @Override
    public void exeCommand() {
        tv.turnOn();
    }
}
