package ClassesAndObjects;

/*
//Version 1.0
public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate ;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString(){
        return String.format("%s, %s Hired: %s Birthday: %s", lastName, firstName, hireDate, birthDate);
    }
}
*/

// Version 2.0
public class Employee {
    private static int count = 0;
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        ++count;

        System.out.printf("Employee constructor: %s %s; count = %d%n", firstName,lastName,count);
    }

    public static int getCount() {
        return count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}