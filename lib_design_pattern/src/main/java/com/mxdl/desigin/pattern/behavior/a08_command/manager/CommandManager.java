package com.mxdl.desigin.pattern.behavior.a08_command.manager;

import com.mxdl.desigin.pattern.behavior.a08_command.contract.ITv;
import com.mxdl.desigin.pattern.behavior.a08_command.entity.TurnChannelCommand;
import com.mxdl.desigin.pattern.behavior.a08_command.entity.TurnOffCommand;
import com.mxdl.desigin.pattern.behavior.a08_command.entity.TurnOnCommand;

/**
 * Description: <CommandManager><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class CommandManager implements ITv {
    private TurnOnCommand mTurnOnCommand;
    private TurnOffCommand mTurnOffCommand;
    private TurnChannelCommand mTurnChannelCommand;

    public CommandManager(TurnOnCommand turnOnCommand, TurnOffCommand turnOffCommand, TurnChannelCommand turnChannelCommand) {
        mTurnOnCommand = turnOnCommand;
        mTurnOffCommand = turnOffCommand;
        mTurnChannelCommand = turnChannelCommand;
    }

    @Override
    public void turnOn() {
        mTurnOnCommand.exeCommand();
    }

    @Override
    public void turnOff() {
        mTurnOffCommand.exeCommand();
    }

    @Override
    public void changeChannel() {
        mTurnChannelCommand.exeCommand();
    }
}
