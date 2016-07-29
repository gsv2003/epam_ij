package homework.lab0;

/**
 * Created by user on 29.07.16.
 */
public class Viewer {

    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println(circle);

        Shape circle2 = new Circle(Color.GREEN, true, 9);
        System.out.println(circle2);

        Shape rectangle = new Rectangle();
        System.out.println(rectangle);

        Shape rectangle2 = new Rectangle(Color.RED, true, 3, 5);
        System.out.println(rectangle2);

        Shape square = new Square();
        System.out.println(square);

        Rectangle square2 = new Square(Color.WHITE, true, 9);
        System.out.println(square2);
    }
}
