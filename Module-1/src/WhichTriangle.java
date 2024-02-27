import java.util.Scanner;

public class WhichTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a==b && a==c) {
            System.out.println("equilateral");
        } else if (a==b || a==c || c==b) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}
