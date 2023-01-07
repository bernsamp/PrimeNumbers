import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nWelcome to a simple program that will output you the prime numbers of a given interval.\n");

        System.out.println("Please select the minimum value of the interval:");

        Scanner scanner = new Scanner(System.in);

        int minValue = scanner.nextInt();

        System.out.println("Now select the maximum value of your interval:");

        int maxValue = scanner.nextInt();

        System.out.println("Here are the prime numbers between " + minValue + " and " + maxValue + ":");

        for (int i = minValue; i <= maxValue; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrimeNumber (int number)
    {
        // 0, 1 and negative numbers are not prime numbers

        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}