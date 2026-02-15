package commands;

import stuff.CollectionHandler;

public class InfoCommand implements Command {
    @Override
    public String desc() {
        return "output info about the HashSet";
    }

    @Override
    public void execute(String... args) {
        CollectionHandler.info();
    }
}
