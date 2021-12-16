package Lesson14;

import java.util.ArrayList;
import java.util.List;

public class Cinderella {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 99; i++) {
            numbers.add((int) (Math.random() * 500));
        }

        List<Integer> setOne = new ArrayList<>();
        List<Integer> setTwo = new ArrayList<>();
        List<Integer> setThree = new ArrayList<>();

        for (Integer number : numbers) {
            if ((number % 2 == 0) && (number % 3 == 0)) {
                setOne.add(number);
                setTwo.add(number);
            } else if (number % 2 == 0) {
                setOne.add(number);
            } else if (number % 3 == 0) {
                setTwo.add(number);
            } else {
                setThree.add(number);
            }
        }

        System.out.println("Collection with all numbers " + numbers);
        System.out.println("Numbers Divisible by 2 " + setOne);
        System.out.println("Numbers Divisible by 3 " + setTwo);
        System.out.println("All other numbers " + setThree);
    }
}

