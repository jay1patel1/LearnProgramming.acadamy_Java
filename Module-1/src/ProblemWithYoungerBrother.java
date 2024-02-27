import java.util.Scanner;

public class ProblemWithYoungerBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();

        int val4 = (val1+val2)%val3;

        System.out.println(val4);
    }
}
