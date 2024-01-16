import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        int number = 12345;

        int sum = calculateSumOfDigitsOfNumbers(number);

        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sum);
    }

    private static int calculateSumOfDigitsOfNumbers(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
