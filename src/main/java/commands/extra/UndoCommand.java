package commands.extra;

import commands.Command;

public class UndoCommand implements Command {
    @Override
    public String desc() {
        return "undo ";
    }

    @Override
    public void execute(String... args) {
        //todo:
        // execute_script
        // create stacks for command keeping
        // ! empty stacks when loading
        // redo (uh oh) (also empty stack when branching)
    }
}
