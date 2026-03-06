package commands.basic;

import commands.Command;
import elements.Route;
import handlers.CollectionHandler;

import java.util.Arrays;
import java.util.HashSet;

public class ClearCommand implements Command {
    @Override
    public String desc() {
        return "clear all data";
    }

    @Override
    public void execute(String... args) {
        CollectionHandler.clear();
    }

    @Override
    public void undo(Route... routes) {
        HashSet<Route> hashRoutes = new HashSet<>(Arrays.asList(routes));
        CollectionHandler.setRoutes(hashRoutes);
    }
}
