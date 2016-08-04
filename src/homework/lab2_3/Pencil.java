package homework.lab2_3;

/**
 * Created by user on 04.08.16.
 */
public class Pencil extends Stationery {

    private String color;
    public Pencil(String manufacturer, double price, String color)
    {
        super(manufacturer, price);
        this.color = color;
    }
}
