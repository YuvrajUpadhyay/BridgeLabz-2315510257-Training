package PACKAGE_NAME;
import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Invalid number.");
            return;
        }

        int temp = number;
        int[] digits = new int[10];
        int index = 0;

        while (temp > 0 && index < 10) {
            digits[index++] = temp % 10;
            temp /= 10;
        }

        int[] freq = new int[10];
        for (int i = 0; i < index; i++) {
            freq[digits[i]]++;
        }

        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i]);
            }
        }

    }
}

