package homework.lab2_3;

/**
 * Created by user on 04.08.16.
 */
public class Stationery {

    protected String manufacturer;
    protected double price;

    public Stationery(){}

    public Stationery(String manufacturer, double price)
    {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + " is manufactured " + manufacturer +
                ". Price: " + getPrice();
    }

}
