public class MatrixTranspose {
    public static int[][] solve(int[][] A) {

        int[][] returnAr = new int[A[0].length][A.length];

        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                returnAr[i][j] = A[j][i];
            }
        }

        for (int i = 0; i < returnAr.length; i++) {
            for (int j = 0; j < returnAr[i].length; j++) {
                System.out.print(returnAr[i][j] + " ");
            }
            System.out.println();
        }

        return returnAr;
    }

    public static void main(String[] args) {

        int [][] a = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int [][] b = {{1, 2},{1, 2},{1, 2}};

        solve (a);
        solve (b);
    }
}
