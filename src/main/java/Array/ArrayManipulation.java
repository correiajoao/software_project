package Array;

import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.1};

        Arrays.sort(doubleArray);

        System.out.printf("%ndoubleArray: ");
        for (double value: doubleArray) {
            System.out.printf("%.1f ", value);
        }

        int[] filledArray = new int[10];
        Arrays.fill(filledArray, 7);

        int[] intArray = {1,2,3,4,5,6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray,0, intArrayCopy, 0, intArray.length);

        System.out.printf("%nintArray: ");
        for (int value: intArray) {
            System.out.printf("%d ", value);
        }

        System.out.printf("%nintArrayCopy: ");
        for (int value: intArrayCopy) {
            System.out.printf("%d ", value);
        }

        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n", b ? "==" : "!=");

    }
}
