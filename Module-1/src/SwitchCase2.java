import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case '0':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
