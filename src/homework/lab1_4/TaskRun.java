package homework.lab1_4;

/**
 * Created by user on 03.08.16.
 */
public class TaskRun {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
            System.out.printf("%2d", arr[i]);
        }
        System.out.println();
        Maximum max = new Maximum();
        max.max(arr);
    }
}
