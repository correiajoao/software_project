package Addition;

import java.util.Scanner;

public class Addition {

    //main method begins execution of Java application
    public static void main(String[] args) {

        //Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; // First number to add
        int number2; // Second number to add
        int sum;    // Sum of number1 and number2

        System.out.print("Enter first integer: "); //Prompt
        number1 = input.nextInt(); //Read first number from user

        System.out.print("Enter second integer: "); //Prompt
        number2 = input.nextInt(); //Read first number from user

        sum = number1 + number2; //Add number, then store total in sum

        System.out.printf("Sum is %d%n", sum); // Display sum

    }
}
