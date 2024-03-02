public class String_2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        // s2 = "bca";

        System.out.println(s2);

        if (s1.equals(s2)) {
            System.out.println("Equal");
        }
    }
}
