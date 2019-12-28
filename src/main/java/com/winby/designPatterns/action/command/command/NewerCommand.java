package com.winby.designPatterns.action.command.command;


import com.winby.designPatterns.action.command.Command;
import com.winby.designPatterns.action.command.handler.NewerHandler;

public class NewerCommand extends Command {
    private NewerHandler handler = new NewerHandler();

    @Override
    public String execute() {
        return handler.getNewers();
    }
}
