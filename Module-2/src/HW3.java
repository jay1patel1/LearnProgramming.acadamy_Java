import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        int[] arr = {5,6,10,45,76,23,45,89,45,34,36,345,78,34};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[(arr.length-1)]);
    }
}
