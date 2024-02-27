import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main (String[] args) {
        System.out.println("Please enter the principal amount");
        Scanner s_Principal = new Scanner(System.in);
        int principal = s_Principal.nextInt();

        System.out.println("Please enter the rate of interest");
        Scanner s_Rate = new Scanner(System.in);
        double rate = s_Rate.nextDouble();

        System.out.println("Please enter the duration of the years");
        Scanner s_Duration = new Scanner(System.in);
        int duration = s_Duration.nextInt();

        double interest = (double)((principal*rate*duration) / 100);
        int printInterest = (int) interest;
        int printReturnValue = principal + printInterest;

        System.out.println("Your value of interest is " + printInterest + " , You will pay: " + printReturnValue + ", After " + duration + " years");
    }
}
