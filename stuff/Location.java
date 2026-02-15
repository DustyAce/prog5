package stuff;

import java.util.Scanner;

public class Location {
    private Long x;
    private Float y; //Поле не может быть null
    private Float z; //Поле не может быть null
    private String name = ""; //Строка не может быть пустой, Поле не может быть null

    Location() {
        Scanner sc = new Scanner(System.in);
        this.x = Message.longInput("Location x", true, null, null);
        this.y = Message.floatInput("Location y", false, null, null);
        this.z = Message.floatInput("Location z", false, null, null);

        while (name.isBlank()) { //TODO: add Message.strInput?
            System.out.print("Input name:\n>>> ");
            this.name = sc.nextLine();
            if (name.isBlank()) {System.out.println("Name cannot be blank!");}
        }

    }

    @Override
    public String toString() {
        return name;
    }
}