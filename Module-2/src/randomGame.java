public class randomGame {
    public static void main(String[] args) {

        int randomValue = 0;

        while (randomValue != 5) {
            randomValue = (int) (Math.random() * 10) + 1;

            if ((randomValue%2) == 0) {
                continue;
            }
            System.out.println(randomValue);
        }

    }
}
