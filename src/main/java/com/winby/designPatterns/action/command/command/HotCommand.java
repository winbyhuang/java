package com.winby.designPatterns.action.command.command;


import com.winby.designPatterns.action.command.Command;
import com.winby.designPatterns.action.command.handler.HotHandler;

public class HotCommand extends Command {
    private HotHandler handler = new HotHandler();

    @Override
    public String execute() {
        return handler.getHots();
    }
}
