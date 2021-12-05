package Lesson10;

import java.util.Arrays;

public class Player {
    private String name;
    private Card[] playerHand = new Card[5];

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + "}" + '\'' + "\n" +
                "{playerHand=" + Arrays.toString(playerHand) +
                '}';
    }

    public Card[] getCardsFromDeck(Card[] deck) {
        int j = 0;
        try {
            for (int i = 0; i < playerHand.length; ) {
                if (j == (deck.length)) {
                    throw new EmptyDeckException();
                } else if (deck[j] == null) {
                    j++;
                } else {
                    playerHand[i] = deck[j];
                    deck[j] = null;
                    j++;
                    i++;
                }
            }
        } catch (EmptyDeckException e) {
            e.printStackTrace();
        }
        return playerHand;
    }

}