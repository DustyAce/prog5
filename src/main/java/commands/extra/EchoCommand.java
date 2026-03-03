package commands.extra;

import commands.Command;

public class EchoCommand implements Command {
    public String desc() {
        return "echo";
    }

    public void execute(String... args) {
        StringBuilder out = new StringBuilder();
        for (String a : args) {
            out.append(a).append(" ");
        }
        System.out.println(out);
    }
}
