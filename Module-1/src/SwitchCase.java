import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                System.out.println("31 Days");
                break;
            case 2:
                System.out.println("February");
                System.out.println("28 Days");
                break;
            case 3:
                System.out.println("March");
                System.out.println("31 Days");
                break;
            case 4:
                System.out.println("April");
                System.out.println("30 Days");
                break;
            case 5:
                System.out.println("May");
                System.out.println("31 Days");
                break;
            case 6:
                System.out.println("Jun");
                System.out.println("30 Days");
                break;
            case 7:
                System.out.println("July");
                System.out.println("31 Days");
                break;
            case 8:
                System.out.println("August");
                System.out.println("31 Days");
                break;
            case 9:
                System.out.println("September");
                System.out.println("30Days");
                break;
            case 10:
                System.out.println("October");
                System.out.println("31 Days");
                break;
            case 11:
                System.out.println("November");
                System.out.println("30 Days");
                break;
            case 12:
                System.out.println("December");
                System.out.println("31 Days");
                break;
        }
    }
}
