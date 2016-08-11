package homework.lab1_2;

/**
 * Created by user on 03.08.16.
 */
public class MinSeq {

    public static void findMin(double limit) {
        if (limit < 0){
            System.out.println("Бесконечность - не предел! Ⓒ Баз Лайтер.");
            return;
        }
        for (int n = 0; ; n++) {
            double a = 1 / Math.pow(n + 1, 2);
            if (a < limit) {
                System.out.println("Наименьший элемент последовательности: " + n);
                return;
            } else {
                System.out.println("Номер элемента последовательности: " + n + " вычисленное значение: " + a);
            }
        }
    }

    /*public static void findMin(double limit){
        int n = 0;

        while(true){
            if (limit < 0){
                return;
            }
            double a = 1 / Math.pow(n + 1, 2);
            if (a < limit) {
                System.out.println("Наименьший элемент последовательности: " + n);
                return;
            } else {
                System.out.println("Номер элемента последовательности: " + n + " вычисленное значение: " + a);
                n++;
            }
        }
    }*/
}
