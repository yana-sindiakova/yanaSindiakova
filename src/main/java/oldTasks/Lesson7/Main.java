package oldTasks.Lesson7;

public class Main {
    public static void main(String[] args) {
        String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        Card[] deck = new Card[suit.length * rank.length];

        CardDeck cardDeck = new CardDeck();
        cardDeck.generateCard(suit, rank, deck);
        cardDeck.shuffleDeck(suit, rank, deck);

        Player playerOne = new Player("Yana");
        Player playerTwo = new Player("Vasia");
        Player playerThree = new Player("Inka");
        Player playerFour = new Player("Vetal");
        playerOne.getCardsFromDeck(deck);
        playerTwo.getCardsFromDeck(deck);
        playerThree.getCardsFromDeck(deck);
        playerFour.getCardsFromDeck(deck);

        System.out.println(playerOne);
        System.out.println(playerTwo);
        System.out.println(playerThree);
        System.out.println(playerFour);

    }

}
