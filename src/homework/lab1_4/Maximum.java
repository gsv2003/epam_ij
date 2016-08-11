package homework.lab1_4;

import java.util.Arrays;

/**
 * Created by user on 03.08.16.
 */
public class Maximum {

    public static void max(int[] arr)
    {
        int max = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            int max1 = arr[i] + arr[arr.length - i - 1];
            if (max < max1) {
                max = max1;
            }
        }
        System.out.println("Максимальный элемент последовательности: " + max);
    }
}
