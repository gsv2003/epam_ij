package homework.lab2_2;

/**
 * Created by user on 04.08.16.
 */
public class Stationery {

    private String name;
    private double price;
    private static final String DEFAULT_NAME = "Pen";
    private static final double DEFAULT_PRICE = 1.25;

    public Stationery()
    {
        this.name = DEFAULT_NAME;
        this.price = DEFAULT_PRICE;
    }

    public Stationery(String name,double price)
    {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
