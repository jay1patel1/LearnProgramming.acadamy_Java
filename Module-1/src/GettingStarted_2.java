import java.util.Scanner;
public class GettingStarted_2 {
    public static void main (String[] args) {
        Scanner s_Principal = new Scanner(System.in);
        int saving = s_Principal.nextInt();
        int spent = s_Principal.nextInt();

        int left = saving-spent;

        System.out.println(left);
    }
}
