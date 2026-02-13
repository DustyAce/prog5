package commands;
import java.util.HashMap;
import java.util.Scanner;

public class Invoker {
    static HashMap<String, Command> commands = new HashMap<>();
    static {
        commands.put("help", new HelpCommand(commands));
        commands.put("exit", new ExitCommand());
    }
    static Command command;

    public static void setCommand(String name) {
        command = commands.get(name); //TODO: add bad command name exception
    }

    public static void executeCommand() {
        command.execute();
    }

}