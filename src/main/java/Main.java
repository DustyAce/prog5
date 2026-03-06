import commands.Invoker;
import handlers.FileHandler;
import handlers.InputHandler;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        FileHandler.load();
        System.out.print(">> ");
        try {


            while (InputHandler.sc.hasNext()) {
                String[] inp = InputHandler.sc.nextLine().strip().split(" ");
                String commandName = inp[0];
                try {
                    Invoker.executeCommand(commandName, Arrays.copyOfRange(inp, 1, inp.length));
                } catch (NullPointerException e) {
                    System.out.println("Command not found. Try 'help'");
                } finally {
                    System.out.print(">> ");
                }
            }
        } catch (NoSuchElementException e) {System.out.println("got it!");}
    }
}