public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0, min = numbers[0], max = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        double avg = sum / (double) numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        System.out.println("Random Numbers: " + java.util.Arrays.toString(randomNumbers));
        double[] stats = findAverageMinMax(randomNumbers);
        System.out.printf("Average: %.2f, Min: %.0f, Max: %.0f%n", stats[0], stats[1], stats[2]);
    }
}
