package com.mxdl.desigin.pattern.behavior.a08_command;

import com.mxdl.desigin.pattern.behavior.a08_command.entity.TV;
import com.mxdl.desigin.pattern.behavior.a08_command.entity.TurnChannelCommand;
import com.mxdl.desigin.pattern.behavior.a08_command.entity.TurnOffCommand;
import com.mxdl.desigin.pattern.behavior.a08_command.entity.TurnOnCommand;
import com.mxdl.desigin.pattern.behavior.a08_command.manager.CommandManager;

import java.util.concurrent.TimeUnit;

/**
 * Description: <Client><br>
 * Author:      mxdl<br>
 * Date:        2019/12/29<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        TurnOnCommand turnOnCommand = new TurnOnCommand(tv);
        TurnOffCommand turnOffCommand = new TurnOffCommand(tv);
        TurnChannelCommand turnChannelCommand = new TurnChannelCommand(tv);
        CommandManager manager = new CommandManager(turnOnCommand,turnOffCommand,turnChannelCommand);

        manager.turnOn();
        manager.changeChannel();
        manager.turnOff();
    }
}
