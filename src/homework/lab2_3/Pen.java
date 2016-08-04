package homework.lab2_3;

/**
 * Created by user on 04.08.16.
 */
public class Pen extends Stationery {

    private String color;

    public Pen(String manufacturer, double price, String color)
    {
        super(manufacturer, price);
        this.color = color;
    }


}
