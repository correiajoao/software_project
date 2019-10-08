package IntroductionClasses;

import java.util.Scanner;

/*

//Version 1.0
import java.util.Scanner;

public class AccountTest {


    public static void main(String[] args) {
        //Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
    }

}

*/

/*

//Version 2.0
public class AccountTest {

    public static void main(String[] args) {
        //Create two account objects
        Account account1 = new Account("Jane Green");
        Account account2 = new Account("Jonh Blue");

        //Display initial value of name for each Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());

    }

}

*/

//Version 3.0
public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("Jonh Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amout for accout1: ");
        double depositAmout = input.nextDouble();

        System.out.printf("%n Adding %.2f to account1 balance%n%n", depositAmout);
        account1.deposit(depositAmout);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amout for accout2: ");
        depositAmout = input.nextDouble();

        System.out.printf("%n Adding %.2f to account2 balance%n%n", depositAmout);
        account2.deposit(depositAmout);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

    }
}
