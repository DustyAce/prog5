import commands.Command;
import commands.Invoker;

import java.util.Scanner;

class Main {
    Invoker invoker = new Invoker();
    public static void main() {
        System.out.print(">> ");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) { //???
            try {
            String commandName = sc.nextLine().strip();
            Invoker.setCommand(commandName);
            Invoker.executeCommand();
            } catch (Exception e) {
                System.out.println("Command not found. Try 'help'");
            } finally {
                System.out.print(">> ");
            }
        }
    }
}