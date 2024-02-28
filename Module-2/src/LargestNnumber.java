import java.util.Scanner;

public class LargestNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value you want to check");
        int n = sc.nextInt();

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter " + (i+1) + " value in console");
            int currentValue = sc.nextInt();

            maxValue = Math.max(maxValue,currentValue);
        }

        System.out.println("Max value is:" + maxValue);
    }
}
