import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int i = 0;

        while (value > 10) {
            i++;
            value = value / 10;
        }

        System.out.println("Given value has the length of " + i);
    }
}
