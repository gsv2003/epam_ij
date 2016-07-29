package homework.lab0;

/**
 * Created by user on 29.07.16.
 */
public class Viewer {

    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println(circle.toString());

        Shape circle2 = new Circle(Color.GREEN, true, 9);
        System.out.println(circle2.toString());

        Shape rectangle = new Rectangle();
        System.out.println(rectangle.toString());

        Shape rectangle2 = new Rectangle(Color.RED, true, 3, 5);
        System.out.println(rectangle2.toString());

        Shape square = new Square();
        System.out.println(square.toString());

        Rectangle square2 = new Square(Color.WHITE, true, 9);
        System.out.println(square2.toString());
    }
}
