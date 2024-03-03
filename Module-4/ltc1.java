class ltc1 {
    static void introduce(String name, int age, String[] hobbies) {
        System.out.println("My Name is " + name + ".");
        System.out.println("I am " + age + " years old!");
        System.out.println("My hobbies are :");
        for (String hobby : hobbies) {
            System.out.println("  - " + hobby);
        }
    }

    public static void main(String[] args) {
        String name = "Jay Patel";
        int age = 20;
        String[] hobbies = {"Photography","Football","Programming"};
        introduce (name,age,hobbies);
    }
}