package commands;

import stuff.CollectionHandler;

public class ShowCommand implements Command{
    public String desc() {return "show the contents of the HashMap";}

    public void execute(String... args) {
        CollectionHandler.show();
    }
}
