package homework.lab2_2;

/**
 * Created by user on 04.08.16.
 */
public class Stationery {

    private String name;
    private double price;

    public Stationery()
    {
        this.name = "Pen";
        this.price = 1.25;
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
