package stuff;

import java.util.Scanner;

public class Route {
    public static Long instanceCounter = 0L;
    private Long id; //[+] Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name = ""; //[+] Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //[+] Поле не может быть null
    private java.time.LocalDateTime creationDate; //[+] Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Location from; //[+] Поле может быть null
    private Location to; //[+] Поле может быть null
    private Long distance; //[+] Поле не может быть null, Значение поля должно быть больше 1

    Route() {
        this.id = Route.instanceCounter++;
        this.creationDate = java.time.LocalDateTime.now();
        Scanner sc = new Scanner(System.in);

        while (name.isBlank()) {
            System.out.print("Input Route name:\n>>> ");
            this.name = sc.nextLine();
            if (name.isBlank()) {System.out.println("name cannot be blank!");}
        }

        System.out.println("Coordinates:");
        this.coordinates = new Coordinates();

        System.out.print("Add 'from' Location? (y/N)\n>>> ");
        if (sc.nextLine().strip().equalsIgnoreCase("y")) { this.from = new Location(); }

        System.out.print("Add 'to' Location? (y/N)\n>>> ");
        if (sc.nextLine().strip().equalsIgnoreCase("y")) { this.to = new Location(); }

        this.distance = Message.longInput("distance", false, null, null);


        System.out.println("-- New Route created!");
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", this.id, this.name);
    }

    public String more() {
        return String.format("id%s - '%s'\n Coordinates: %s\n from: %s\n to: %s\n distance:%s",
                this.id, this.name,
                this.coordinates,
                this.from,
                this.to,
                this.distance);
    }


}