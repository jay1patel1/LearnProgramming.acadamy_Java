import java.util.Arrays;

public class HW4 {
    public static void main(String[] args) {

        int[] arr = {45,65,23,78,23,67,45,568,245,459,965};
        int[] rArr = new int[arr.length];
        int pointer_A = 0;

        for (int i = (arr.length-1); i >= 0 ; i--) {
            rArr[pointer_A] = arr[i];
            pointer_A++;
        }

        System.out.println(Arrays.toString(rArr));
    }
}
