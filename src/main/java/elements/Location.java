package elements;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import handlers.InputHandler;

/**
 * Location class
 */
public class Location {
    @JacksonXmlProperty
    private Long x;
    @JacksonXmlProperty
    private Float y; //Поле не может быть null
    @JacksonXmlProperty
    private Float z; //Поле не может быть null
    @JacksonXmlProperty
    private String name = ""; //Строка не может быть пустой, Поле не может быть null

    Location() {
        if (Route.isLoading) {return;}
        this.x = InputHandler.longInput("Location x", true, null, null);
        this.y = InputHandler.floatInput("Location y", false, null, null);
        this.z = InputHandler.floatInput("Location z", false, null, null);
        this.name = InputHandler.stringInput("Location name", false);
    }

    boolean validate() {
        return (y != null
                && z != null
                && name != null
                && !name.isBlank());
    }

    @Override
    public String toString() {
        return String.format("%s: (x: %s, y: %s, z: %s)", name, x, y, z);
    }
}