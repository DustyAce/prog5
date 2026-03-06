package commands.info;

import commands.Command;
import commands.Invoker;
import elements.Route;

public class HistoryCommand implements Command {
    @Override
    public String desc() {
        return "show last 15 commands executed";
    }

    @Override
    public void execute(String... args) {
        for (String s : Invoker.getHistory_old()) {
            System.out.println(s);
        }
    }
}
