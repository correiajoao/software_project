package IntroductionClasses;


/*

// Version 1.0
public class Account {

    private String name; // Instance variable

    // Method to retrieve the name from the object
    public String getName() {
        return name; //Return value of name to caller
    }

    // Method to set the name in the object
    public void setName(String name) {
        this.name = name; // Store the name
    }
}

*/

/*

// Version 2.0
public class Account {

    private String name; // Instance variable

    // Constructor initializes name with parameter name
    public Account(String name) { // Constructor name is class name
        this.name = name;
    }

    // Method to retrieve the name from the object
    public String getName() {
        return name; //Return value of name to caller
    }

    // Method to set the name in the object
    public void setName(String name) {
        this.name = name; // Store the name
    }
}

*/

// Version 3.0
public class Account{

    private String name; // Instance variable
    private double balance; // Instance Variable

    // Account Constructor that receives two parameters
    public Account(String name, Double balance) { // Constructor name is class name
        this.name = name;

        // Validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps its default intial value of 0.0.
        if(balance > 0.0)
            this.balance = balance;
    }

    // Deposits only a valid amount to the balance
    public void deposit (double depositAmount){
        if(depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    // Method returns the account balance
    public double getBalance(){
        return balance;
    }

    // Method to retrieve the name from the object
    public String getName() {
        return name; //Return value of name to caller
    }

    // Method to set the name in the object
    public void setName(String name) {
        this.name = name; // Store the name
    }
}