import java.util.Scanner;

public class palendrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();

        if (str.equals(rev)) {
            System.out.println("Yest it is palendrom");
        } else {
            System.out.println("No it is not a palendrom");
        }
    }
}
