package Lesson3;

public class Magnitude {
    public static void main(String[] args) {
        int number1;
        int number2;
        number1 = -25;
        number2 = 5;

        if (Math.abs(number1) > Math.abs(number2)) {
            System.out.println("Bigger number is " + number1);
        } else {
            System.out.println("Bigger number is " + number2);
        }
    }
}
