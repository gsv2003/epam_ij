package homework.lab1_3;

/**
 * Created by user on 03.08.16.
 */
public class Tangent {


    public static void func(double first, double last, double step){
        System.out.printf("%3s%5s%7s%n", "x", "|", "F(x)");
        for (double count = first; count <= last; count += step)
        {
            double result = Math.tan(2 * count) - 3;
            System.out.println("-----------------");
            System.out.printf("%.3f%3s%8.3f%n", count, "|", result);

        }
    }
}
