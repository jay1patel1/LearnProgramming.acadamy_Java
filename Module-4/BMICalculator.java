import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int weight = sc.nextInt();
        double bMI;

        double heightIn_M = (double) height / 100;
        bMI = (double) weight / (heightIn_M*heightIn_M);

        System.out.println(weight);
        System.out.println(height);
        System.out.println(heightIn_M);
        System.out.println(bMI);

        if (bMI < 18.5) {
            System.out.println("Underweight");
        } else if (bMI >= 18.5 && bMI <= 24.9) {
            System.out.println("Normal");
        } else if (bMI > 24.9 && bMI <= 29.9) {
            System.out.println("Overweight");
        } else if (bMI > 29.9) {
            System.out.println("Obese");
        }
    }
}
