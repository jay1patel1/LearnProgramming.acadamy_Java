import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);


        System.out.println("Add Value of books available");
        int[] arr = new int[sc.nextInt()];


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Add Books in array");
            arr[i] = sc.nextInt();
        }

        boolean search = true;

        while (search) {

            System.out.println ("Search book");
            int searchKey = sc.nextInt();

            if (searchKey < arr.length) {
                System.out.println(arr[searchKey]);
            } else {
                System.out.println("book is not available");
            }

            System.out.println("want to search more book?");
        }

    }
}
