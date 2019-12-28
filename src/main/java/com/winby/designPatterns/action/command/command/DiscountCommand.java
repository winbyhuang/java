package com.winby.designPatterns.action.command.command;


import com.winby.designPatterns.action.command.Command;
import com.winby.designPatterns.action.command.handler.DiscountHandler;

public class DiscountCommand extends Command {

    private DiscountHandler handler = new DiscountHandler();

    @Override
    public String execute() {
        return handler.getDiscounts();
    }
}
