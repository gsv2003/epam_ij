package homework.lab1_2;

/**
 * Created by user on 03.08.16.
 */
public class MinSeq {

    private double limit;
    private double a;

    public void findMin(double limit)
    {
        for (int n = 0; ; n++)
        {
            a = 1 / Math.pow(n+1,2);
            if (a < limit)
            {
                System.out.println("Наименьший элемент последовательности: " + n);
                return;
            }else
            {
                System.out.println("Номер элемента последовательности: " + n + " вычисленное значение: " + a);
            }
        }
    }
}
