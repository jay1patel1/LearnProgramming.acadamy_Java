import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String value = (num%2 == 0) ? "Even" : "Odd";

        System.out.println(value);
    }
}
