import java.util.Scanner;

public class SumOfPositiveNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value = 0;
        int sum = 0;

        do {
            System.out.println("provide no");
            value = sc.nextInt();

            sum += value;
        } while (value > 0);

        System.out.println(sum);
    }
}
