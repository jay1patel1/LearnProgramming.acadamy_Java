import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        int value2 = sc.nextInt();
        int plusValue = Math.max(value1,value2);
        int lcm = plusValue;

        while (((lcm % value1) != 0) || ((lcm % value2) != 0)) {
            lcm = lcm + plusValue;
        }

        System.out.println(lcm);
    }
}
