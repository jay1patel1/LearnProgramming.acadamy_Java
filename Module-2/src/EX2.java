public class EX2 {
    public int solve(int[] A) {

        for (int i = 0; i < (A.length-1); i++) {
            if (A[i+1] >= A[(i)]) {
                continue;
            } else {
                return 0;
            }
        }
        return 1;
    }
}
