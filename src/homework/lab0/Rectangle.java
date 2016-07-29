package homework.lab0;

/**
 * Created by user on 29.07.16.
 */
public class Rectangle extends Shape {

    private double width;
    private double height;

    Rectangle ()
    {
        width = 0;
        height = 0;
    }

    Rectangle(Color color, boolean filled, double width, double height)
    {
        super(color, filled);
        this.width = width;
        this.height = height;
    }


    @Override
    public double getSquare() {
        return width * height;
    }

    @Override
    public double getPerimetr() {
        return 2 * (width + height);
    }
}
