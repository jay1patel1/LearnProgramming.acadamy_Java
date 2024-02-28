import java.util.Arrays;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int[] arr = new int[value];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1)*(i+1);
        }

        System.out.println(Arrays.toString(arr));
    }
}
