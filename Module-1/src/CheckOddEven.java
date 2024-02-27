import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int valueIn = value.nextInt();

        if ((valueIn%2) == 0 ) {
            System.out.println("The given value is Even");
        } else {
            System.out.println("The given value is Odd");
        }
    }
}
