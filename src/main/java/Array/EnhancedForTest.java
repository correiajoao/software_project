package Array;

public class EnhancedForTest {

    public static void main(String[] args) {
        int[] array = {45,56,75,23,78,22,99,23,74};
        int total = 0;

        for (int number: array) {
            total += number;
        }

        System.out.printf("Total of array elements: %d%n", total);
    }
}
