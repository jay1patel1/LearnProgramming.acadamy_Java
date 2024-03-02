/**
 * besslystring
 */
public class besslystring {

    public static int solve(String A) {

        int p_counter = 0;
        int a_counter = 0;
        int m_counter = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'a') {
                a_counter++;
            } else if (A.charAt(i) == 'p') {
                p_counter++;
            } else if (A.charAt(i) == 'm') {
                m_counter++;
            }
        }

        if (m_counter == (p_counter+a_counter)) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(Integer.toString(solve("mpampamm")));
        System.out.println(Integer.toString(solve("pampampam")));
    }
}