package oldTasks.Lesson4;

import java.util.Arrays;

public class ArrayOne {
    public static void main(String[] args) {
        int[] arrayOne = new int[20];
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random() * 100);
        }
        System.out.println("Array before changes " + Arrays.toString(arrayOne));

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 == 0) {
                arrayOne[i] = 0;
            }
        }
        System.out.println("Array after changes " + Arrays.toString(arrayOne));
    }
}
