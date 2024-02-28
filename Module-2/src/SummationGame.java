import java.util.Scanner;

public class SummationGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int output = (value*(value+1))/2;

        System.out.println(output);
    }
}
