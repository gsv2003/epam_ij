package homework.lab0;

/**
 * Created by user on 29.07.16.
 */
public class Circle extends Shape {

    private double radius;

    Circle ()
    {
        radius = 0;
    }

    Circle(Color color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.sqrt(radius);
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }

}
