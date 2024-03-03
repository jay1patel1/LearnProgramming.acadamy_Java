public class ColumnPrint {

    public static void main(String[] args) {

        int[][] abc = {
                {1,2,3},
                {4,5,6}
        };

        for (int i = 0; i < abc[0].length; i++) {
            for (int j = 0; j < abc.length; j++) {
                System.out.print(abc[j][i] + " ");
            }
            System.out.println();
        }
    }
}
