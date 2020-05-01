package com.yibo.designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangyibo
 * @Date: 2020/5/1 15:59
 * @Description:
 */
public class Staff {

    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        this.commandList.add(command);
    }

    public void executeCommands(){
        this.commandList.forEach(command -> command.execute());
        commandList.clear();
    }
}
