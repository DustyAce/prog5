package commands.basic;
import commands.Command;
import elements.Route;
import handlers.CollectionHandler;

public class AddCommand implements Command {
    public String desc() {return "add an object";}
    public void execute(String... args) {
        CollectionHandler.add();
    }

    @Override
    public void undo(Route... routes) {
        if (routes.length == 1) {
            CollectionHandler.remove_by_id(routes[0].getId());
        } else {
            System.out.println("Undo failed, bad argument");
        }
    }
}
