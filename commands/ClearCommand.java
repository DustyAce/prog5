package commands;

import stuff.CollectionHandler;

public class ClearCommand implements Command{
    @Override
    public String desc() {
        return "clear all data";
    }

    @Override
    public void execute(String... args) {
        CollectionHandler.clear();
    }
}
