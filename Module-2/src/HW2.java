import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW2 {
    public static void main(String[] args) {

        int[] arr1 = {1,5,6,10,3,7,56,34,67,32};
        int[] arr2 = {1,6,3,4,7,10,45,67,34};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> rerunArray = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    rerunArray.add(arr2[j]);
                }
            }
        }

        System.out.println(rerunArray);
    }
}
