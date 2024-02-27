public class DataType {
    public static void main (String[] args) {

//        Non-Numeric
        char c = 'c';
        System.out.println(c);
        boolean a = true;
        System.out.println(a);

//        Numeric
        byte b = 127;
        System.out.println(b);
        double d = 45.45;
        System.out.println(d);
        short s = 5;
        System.out.println(s);
        long l = 3453434345L;
        System.out.println(l);
        int i = 10;
        System.out.println(i);

//        String
        String sg = "I love Java!!!";
        System.out.println(sg);
        System.out.println(sg.charAt(3));

        String s2 = """
                Jay
                Jay
                Jay
                Jay
                Jay
                Jay
                """;
        System.out.println(s2);

    }
}
