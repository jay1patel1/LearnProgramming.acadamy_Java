public class StringB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I love Arti");
        sb.append(" and Mishti,");

        System.out.println(sb);

        sb.insert(sb.length(), " and mom dad");

        System.out.println(sb);

        boolean fg = true;

        System.out.println(Boolean.toString(fg));
    }
}
