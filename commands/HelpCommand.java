package commands;

import java.util.HashMap;
import java.util.Map;

public class HelpCommand implements Command{
    private HashMap<String, Command> commands;

    public HelpCommand(HashMap<String, Command> commands) {
        this.commands = commands;
    }

    public String desc() {
        return "Outputs a list of all commands";
    }

    public void execute() {
        for (Map.Entry<String, Command> c: commands.entrySet()) {
            System.out.printf("%s - %s\n", c.getKey(), c.getValue().desc());
        }
    }
}
