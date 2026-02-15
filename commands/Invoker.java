package commands;
import java.util.HashMap;

public class Invoker {
    static Command command;
    static HashMap<String, Command> commands = new HashMap<>();
    //static Command[] history = new Command[15]; //find a better data struct for history

    static {
        // Meta
        commands.put("help", new HelpCommand());
        commands.put("exit", new ExitCommand());
        //commands.put("history", new HistoryCommand());

        // Basic collection manip
        commands.put("show", new ShowCommand());
        commands.put("add", new AddCommand());
        commands.put("info", new InfoCommand());
        commands.put("remove", new RemoveCommand());
        commands.put("clear", new ClearCommand());
        //commands.put("update", new UpdateCommand());


        // Cyclical collection manip
        //commands.put("add_if_min", new AddIfMinCommand());
        //commands.put("remove_greater", new RemoveGreaterCommand());
        //commands.put("filter_contains_name", new FilterByNameCommand());
        //commands.put("print_ascending", new PrintAscendingCommand());
        //commands.put("print_unique_distance", new PrintUniqueDistanceCommand());

        // File stuff
        //commands.put("save", new SaveCommand());
        //commands.put("execute_script", new UpdateCommand());

        // Unnecessary/debug
        commands.put("more", new MoreCommand());
        commands.put("псж", new PSZHCommand());
        commands.put("echo", new EchoCommand());

    }

    public static void executeCommand(String name, String... args) {
        commands.get(name).execute(args);
    }

}