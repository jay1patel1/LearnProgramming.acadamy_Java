/**
 * replaceChar
 */
public class replaceChar {

    public static String change_char(String s) {
        // complete the function template
        String returnString = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == s.charAt(i) && i > 0) {
                returnString = returnString + "$";
            } else {
                returnString = returnString + s.charAt(i);
            }
        }

        return returnString;
    }
    public static void main(String[] args) {
        System.out.println(change_char("restart"));
    }
}