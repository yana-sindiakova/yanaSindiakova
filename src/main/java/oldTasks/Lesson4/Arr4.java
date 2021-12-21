package Lesson4;

import java.util.Arrays;

public class Arr4 {
    public static void main(String[] args) {

        String[] cardsStack = new String[52];
        String[] diamonds = new String[13];
        String[] spades = new String[13];
        String[] hearts = new String[13];
        String[] clubs = new String[13];

        for (int i = 0; i < diamonds.length; i++) {
            diamonds[i] = getCards(i + 2) + " {diamonds}";
        }
        for (int i = 0; i < spades.length; i++) {
            diamonds[i] = getCards(i + 2) + " {spades}";
        }
        for (int i = 0; i < hearts.length; i++) {
            diamonds[i] = getCards(i + 2) + " {hearts}";
        }
        for (int i = 0; i < clubs.length; i++) {
            diamonds[i] = getCards(i + 2) + " {clubs}";
        }

        System.out.println(Arrays.toString(diamonds));

    }

    public static String getCards(int index) {
        if (index == 11) {
            return "Jack";
        } else if (index == 12) {
            return "Queen";
        } else if (index == 13) {
            return "King";
        } else if (index == 14) {
            return "Ace";
        } else return index + "";
    }
}
