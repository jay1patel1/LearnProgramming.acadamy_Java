import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {
        int[][] array = {
                {2,3,4,6},
                {-4,5,2,4},
                {-9,-3,-5,-7},
                {3,2}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ",");
            }
            System.out.println();
        }
    }
}
