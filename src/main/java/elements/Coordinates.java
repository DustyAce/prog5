package elements;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import handlers.InputHandler;

/**
 * Coordinates class
 */
public class Coordinates{
    @JacksonXmlProperty
    private Integer x; //Максимальное значение поля: 926
    @JacksonXmlProperty
    private Float y;//Значение поля должно быть больше -974, Поле не может быть null

    public Coordinates() {
        if (Route.isLoading) {return;}
        Integer tmp = InputHandler.intInput("x", true, 927, null);
        if (tmp != null) {this.x = tmp;}
        this.y = InputHandler.floatInput("y", false, null, -974f);
    }

    @Override
    public String toString() {
        return String.format("x: %d y: %f", x, y);
    }
}