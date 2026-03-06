package commands;

import commands.basic.*;
import commands.comparing.AddMinCommand;
import commands.comparing.PrintAscendingCommand;
import commands.comparing.RemoveGreaterCommand;
import commands.extra.EchoCommand;
import commands.extra.MoreCommand;
import commands.extra.PSZHCommand;
import commands.file.ExecuteScriptCommand;
import commands.file.LoadCommand;
import commands.file.SaveCommand;
import commands.info.*;
import elements.Route;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Stack;

/**
 * Class responsible for executing commands
 */
public class Invoker {
    static HashMap<String, Command> commands = new HashMap<>();
    static ArrayDeque<String> history_old = new ArrayDeque<>();

    static Stack<HistoryEntry> history = new Stack<>();
    static Stack<HistoryEntry> undoHistory = new Stack<>();

    public static boolean historyWritable = true;

    static {
        // Meta
        commands.put("help", new HelpCommand());
        commands.put("exit", new ExitCommand());
        commands.put("history", new HistoryCommand());

        // Basic collection manip
        commands.put("show", new ShowCommand());
        commands.put("add", new AddCommand());
        commands.put("info", new InfoCommand());
        commands.put("remove", new RemoveCommand());
        commands.put("clear", new ClearCommand());
        commands.put("update", new UpdateCommand());


        // Cyclical collection manip
        commands.put("add_if_min", new AddMinCommand());
        commands.put("remove_greater", new RemoveGreaterCommand());
        commands.put("filter_contains_name", new FilterNameCommand());
        commands.put("print_ascending", new PrintAscendingCommand());
        commands.put("print_unique_distance", new UniqueDistanceCommand());

        // File stuff
        commands.put("save", new SaveCommand());
        commands.put("execute_script", new ExecuteScriptCommand());

        // Unnecessary/debug
        commands.put("more", new MoreCommand());
        commands.put("псж", new PSZHCommand());
        commands.put("echo", new EchoCommand());
        commands.put("load", new LoadCommand());

    }

    /**
     * Execute a specified command
     * @param name String name of the command
     * @param args command arguments
     */
    public static void executeCommand(String name, String... args) {
        commands.get(name).execute(args);
        addToHistory(name);
    }

    /**
     * Write a command to history.
     * @param name of the command to add
     */
    private static void addToHistory(String name) {
        if (!historyWritable) {return;} // stops execute_script commands from being added

        history_old.add(name);
        if (history_old.size() > 15) {
            history_old.removeFirst();
        }
    }

    private static void addToHistory(Command c, Route... r) {
        history.push(new HistoryEntry(c, r));
    }

    /**
     * Returns history
     * @return a list of last 15 commands
     */
    public static ArrayDeque<String> getHistory_old() {
        return history_old;
    }

    /**
     * Returns all commands
     * @return the HashMap of command name-object pairs
     */
    public static HashMap<String, Command> getCommands() {
        return commands;
    }
}