package commands;

import commands.meta.Command;
import commands.meta.HistoryEntry;
import commands.meta.Invoker;
import handlers.OutputHandler;

public class HistoryCommand implements Command {
    @Override
    public String desc() {
        return "show last 15 commands executed";
    }

    @Override
    public void execute(String... args) {
        for (HistoryEntry h : Invoker.getHistory()) {
            OutputHandler.message(h.command().getName());
        }
    }

    @Override
    public String getName() {
        return "history";
    }
}
