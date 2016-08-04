package homework.lab2_1;

/**
 * Created by user on 04.08.16.
 */
//Разработайте спецификацию и создайте класс Ручка (Pen).
// Определите в этом классе методы equals(), hashCode() и toString().
public class Main {

    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen(Color.BLUE, false, false);
        Pen pen3 = new Pen();
        System.out.println(pen1);
        System.out.println(pen2);
        System.out.println(pen3);
        System.out.println(pen1.equals(pen2));
        System.out.println(pen1.equals(pen3));
        System.out.printf("%d\t%d\n", pen1.hashCode(), pen2.hashCode());
        System.out.printf("%d\t%d", pen1.hashCode(), pen3.hashCode());
    }
}
