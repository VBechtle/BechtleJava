public class MakeUpAnAlgorithm {
    public static void main(String[] args) {
        int number = 6;
        String name = "John";
        int[] array = {3, 5, 9, 12, 14, 18, 20, 21, 25};

        if (number > 7) {
            System.out.println("Hello");
        }

        if ("John".equals(name)) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        System.out.println("Array elements that are multiples of 3:");
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}