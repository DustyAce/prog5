package commands;

import java.util.Scanner;

public class EchoCommand implements Command{
    public String desc() {return "echo!";}

    public void execute(String... args) {
        if (args.length != 0) {
            for (String a : args) {
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print(">>> ");
        System.out.println(sc.nextLine());
    }

}
