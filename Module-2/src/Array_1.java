import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

//        marks.add(30);

        System.out.println(Arrays.toString(marks));
    }
}
