import java.sql.Array;
import java.util.Arrays;

public class RowColumnSums {
    public static int[] solve(int[][] A) {

        int [] returnArray = new int[A.length + A[0].length];
        int arrayPointer = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                returnArray[arrayPointer] += A[i][j];
            }
            arrayPointer++;
        }

        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                returnArray[arrayPointer] += A[j][i];
            }
            arrayPointer++;
        }

        System.out.println(Arrays.toString(returnArray));

        return returnArray;
    }

    public static void main(String[] args) {
        int [][] a = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int [][] b = {{1, 2},{1, 2},{1, 2}};
        int [][] c = {{1, 2},{4, 5},{8, 9}};

        solve(a);
        solve(b);
        solve(c);
    }
}
