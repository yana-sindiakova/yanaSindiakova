package oldTasks.Lesson4;

import java.util.Arrays;

public class ArrayTwo {
    public static void main(String[] args) {
        double total = 0;
        double arifmeticMean;
        int[] arrayTwo = new int[5];
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = (int) (Math.random() * 10);
            total = total + arrayTwo[i];
        }
        System.out.println("ArrayTwo " + Arrays.toString(arrayTwo));
        System.out.println("Total sum of all elements is " + total);

        arifmeticMean = total / arrayTwo.length;

        System.out.println("Arifmetic mean of ArrayTwo is " + arifmeticMean);
    }
}
