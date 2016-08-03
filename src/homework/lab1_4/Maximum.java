package homework.lab1_4;

import java.util.Arrays;

/**
 * Created by user on 03.08.16.
 */
public class Maximum {

    private int max;

    public void max(int[] arr)
    {
        int[] newArr = new int[arr.length/2];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i] + arr[arr.length - i - 1];
        }
        Arrays.sort(newArr);
        max = newArr[newArr.length-1];
        System.out.println("Максимальный элемент последовательности: " + max);
    }
}
