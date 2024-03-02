public class Differenceofevenandodd {
    public static int even_odd(int[] A) {
        // Write your code here
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < A.length; i++) {

            if (A[i]%2 == 0) {
                evenSum = evenSum + A[i];
            } else {
                oddSum = oddSum + A[i];
            }
        }

        int min = Math.min(oddSum,evenSum);
        int max = Math.max(oddSum,evenSum);

        int diff = max - min;

        return diff;
    }
}
