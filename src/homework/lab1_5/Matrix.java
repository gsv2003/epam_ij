package homework.lab1_5;

/**
 * Created by user on 03.08.16.
 */
public class Matrix {

    private byte[][] arr;

    public Matrix(int size)
    {
        arr = new byte[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i == arr.length - j - 1){
                    arr[i][j] = 1;
                }
            }
        }
    }

    public void printMatrix()
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
