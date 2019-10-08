package Comparison;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {

        //Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; // First number to compare
        int number2; // Second number to compare

        System.out.print("Enter first integer: "); //Prompt
        number1 = input.nextInt(); //Read first number from user

        System.out.print("Enter second integer: "); //Prompt
        number2 = input.nextInt(); //Read first number from user

        if(number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if(number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);

        if(number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);

        if(number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);

        if(number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);

        if(number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);

    }
}
