public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = {19, 0, 7, 1, 8, -100, 16, 3};

        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

