public class String_Methods {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));

        System.out.println(str.length());

        System.out.println(str.indexOf("lo W"));

        System.out.println(str.contains("llo"));

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        // System.out.println(str.isEmpty(true));

        String abc = "I love programming.";
        String cba = abc.replace("programming", "java");
        System.out.println(abc + cba);

        String abc1 = abc.substring(3,7);
        System.out.println(abc1);
    }
}
