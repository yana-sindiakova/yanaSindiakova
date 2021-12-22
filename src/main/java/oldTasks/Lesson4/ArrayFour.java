package oldTasks.Lesson4;

import java.util.Arrays;

public class ArrayFour {
    public static void main(String[] args) {
        String[] clubs = new String[13];
        String[] hearts = new String[13];
        String[] spades = new String[13];
        String[] diamonds = new String[13];
        String[] cardStack = new String[52];


        for (int i = 0; i < clubs.length; i++) {
            if (i == 9) {
                clubs[i] = "Jack" + " Clubs";
            } else if (i == 10) {
                clubs[i] = "Queen" + " Clubs";
            } else if (i == 11) {
                clubs[i] = "King" + " Clubs";
            } else if (i == 12) {
                clubs[i] = "Ace" + " Clubs";
            } else {
                clubs[i] = (i + 2) + "" + " Clubs";
            }
        }
        System.out.println(Arrays.toString(clubs));

        for (int i = 0; i < hearts.length; i++) {
            if (i == 9) {
                hearts[i] = "Jack" + " Hearts";
            } else if (i == 10) {
                hearts[i] = "Queen" + " Hearts";
            } else if (i == 11) {
                hearts[i] = "King" + " Hearts";
            } else if (i == 12) {
                hearts[i] = "Ace" + " Hearts";
            } else {
                hearts[i] = (i + 2) + "" + " Hearts";
            }
        }
        System.out.println(Arrays.toString(hearts));

        for (int i = 0; i < spades.length; i++) {
            if (i == 9) {
                spades[i] = "Jack" + " Spades";
            } else if (i == 10) {
                spades[i] = "Queen" + " Spades";
            } else if (i == 11) {
                spades[i] = "King" + " Spades";
            } else if (i == 12) {
                spades[i] = "Ace" + " Spades";
            } else {
                spades[i] = (i + 2) + "" + " Spades";
            }
        }
        System.out.println(Arrays.toString(spades));

        for (int i = 0; i < (diamonds.length); i++) {
            if (i == 9) {
                diamonds[i] = "Jack" + " Diamonds";
            } else if (i == 10) {
                diamonds[i] = "Queen" + " Diamonds";
            } else if (i == 11) {
                diamonds[i] = "King" + " Diamonds";
            } else if (i == 12) {
                diamonds[i] = "Ace" + " Diamonds";
            } else {
                diamonds[i] = (i + 2) + "" + " Diamonds";
            }
        }
        int increment = 0;
        System.out.println(Arrays.toString(diamonds));
        boolean isCardsExist = true;
        boolean isEmptyHearts = false;
        boolean isEmptySpades = false;
        boolean isEmptyDiamonds = false;
        boolean isEmptyClubs = false;
        while (isCardsExist) {
            int randomSuit = (int) (Math.random() * 3);
            int randomCard = (int) (Math.random() * 12);
            String card = null;
            //         System.out.println("randomSuit="+randomSuit);
            //        System.out.println("randomCard="+randomCard);
            if (randomSuit == 1) {
                System.out.println("Try get Clubs card " + randomCard);
                String temp = clubs[randomCard];
                card = temp;
                clubs[randomCard] = null;
            } else if (randomSuit == 2) {
                System.out.println("Try get Diamonds card " + randomCard);

                String temp = diamonds[randomCard];
                card = temp;
                diamonds[randomCard] = null;
            } else if (randomSuit == 3) {
                System.out.println("Try get Spades card " + randomCard);

                String temp = spades[randomCard];
                card = temp;
                spades[randomCard] = null;
            } else if (randomSuit == 0 && !isEmptyHearts) {
                System.out.println("Try get Hearts card " + randomCard);

                String temp = hearts[randomCard];
                for (String element : hearts) {
                    if (element != null) {
                        isEmptyHearts = false;
                    } else {
                        isEmptyHearts = true;
                    }
                }

                card = temp;
                hearts[randomCard] = null;
            }

            if (card != null) {
                System.out.println("Card=" + card);
                cardStack[increment] = card;
                increment = increment + 1;
                System.out.println("Increment = " + increment);
            } else if (increment == 51) {
                isCardsExist = false;
            }


        }
        System.out.println(Arrays.toString(cardStack));
    }
}
