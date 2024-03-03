public class TimeToEndCorona {

    static int solve(int A, int B, int C) {
        int totalNewCases = B;
        int currentCases = C;
        int recoverCases = A;
        int days = 0;

        if (currentCases > 0) {
            int beforeRecovery = totalNewCases + currentCases;
            int afterRecovery = beforeRecovery - recoverCases;

            days = 1 + solve(A,B,afterRecovery);
        }

        return days;
    }

    public static void main(String[] args) {
        System.out.println(solve(5,3,1));
        System.out.println(solve(4,3,2));
        System.out.println(solve(100,38,1500));
        System.out.println(solve(200,78,154568));
    }
}
