package ClassesAndObjects;

public class MemberAccessTest {
    public static void main(String[] args) {
        Time1 time = new Time1();

        //time.hour = 7;     #Error: hour has private acces in Time1
        //time.minute = 15   #Error: minute has private acces in Time1
        //time.second = 30;  #Error: second has private acces in Time1
    }
}
