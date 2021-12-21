package Lesson4;

import java.util.Arrays;

public class ArrayThree {
    public static void main(String[] args) {
        int[] arrayThree = new int[361];
        double sinX;

        for (int i = 0; i < arrayThree.length; i++) {
            arrayThree[i] = i;
        }
        System.out.println(Arrays.toString(arrayThree));
        System.out.println();

        for (int i = 0; i <= arrayThree.length; i = i + 10) {
            sinX = Math.sin(Math.toRadians(arrayThree[i]));
            System.out.println("x=[" + arrayThree[i] + "]  sin(X)=[" + sinX + "]");
        }
    }
}
