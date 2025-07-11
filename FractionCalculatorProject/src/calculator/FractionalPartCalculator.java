package calculator;

import java.util.Scanner;

public class FractionalPartCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        int integerPart = (int) number;
        double fractionalPart = number - integerPart;

        System.out.println("Integer Part: " + integerPart);
        System.out.println("Fractional Part: " + fractionalPart);
    }
}