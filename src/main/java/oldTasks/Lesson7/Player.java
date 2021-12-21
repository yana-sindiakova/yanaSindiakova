package oldTasks.Lesson7;

import java.util.Arrays;

public class Player {
    String name;
    Card[] playerHand = new Card[5];

    public Player(String name, Card[] hand) {
        this.name = name;
        this.playerHand = hand;
    }

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
        for (int i = 0; i < playerHand.length; ) {
            if (deck[j] == null) {
                j++;
            } else {
                playerHand[i] = deck[j];
                deck[j] = null;
                j++;
                i++;
            }
        }
        return playerHand;

    }

}
