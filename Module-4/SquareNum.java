public class SquareNum {
    static int square(int num) {
        int abc = (num*num);
        System.out.println(abc);
        return abc;
    }

    static int cube(int num) {
        int abc = (num*num*num);
        System.out.println(abc);
        return abc;
    }
    public static void main(String[] args) {
        square(10);
        square(130);
        int abc = square(20);
        System.out.println("Pout var: " + abc);
        cube(10);
        cube(30);
    }
}
