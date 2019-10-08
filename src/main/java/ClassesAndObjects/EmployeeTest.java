package ClassesAndObjects;
/*

//Version 1.0
public class EmployeeTest {

    public static void main(String[] args) {

        Date birth = new Date(7,24,1949);
        Date hire = new Date(3,12,1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        System.out.printf(employee.toString());
    }
}

*/

//Version 2.0
public class EmployeeTest {

    public static void main(String[] args) {

        System.out.printf("Employees before instantiation: %d%n", Employee.getCount());

        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");

        System.out.printf("Employee after instantiation:%n");
        System.out.printf("Via e1.getCount() : %d%n", e1.getCount());
        System.out.printf("Via e2.getCount() : %d%n", e2.getCount());
        System.out.printf("Via Employee.getCount() : %d%n", Employee.getCount());

        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",
                e1.getFirstName(), e1.getLastName(), e2.getFirstName(), e2.getLastName());
    }
}
