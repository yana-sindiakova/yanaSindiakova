package oldTasks.Lesson10;

public class Main {
    public static void main(String[] args) {
        String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        Card[] deck = new Card[suit.length * rank.length];

        CardDeck cardDeck = new CardDeck();
        cardDeck.generateCard(suit, rank, deck);
        cardDeck.shuffleDeck(deck);

        Player player1 = new Player("Yana");
        Player player2 = new Player("Vasia");
        Player player3 = new Player("Inka");
        Player player4 = new Player("Vetal");
        Player player5 = new Player("V");
        Player player6 = new Player("Ve");
        Player player7 = new Player("Vet");
        Player player8 = new Player("J");
        Player player9 = new Player("K");
        Player player10 = new Player("F");

        //Made this one to get Exception
        Player player11 = new Player("Out");

        player1.getCardsFromDeck(deck);
        player2.getCardsFromDeck(deck);
        player3.getCardsFromDeck(deck);
        player4.getCardsFromDeck(deck);
        player5.getCardsFromDeck(deck);
        player6.getCardsFromDeck(deck);
        player7.getCardsFromDeck(deck);
        player8.getCardsFromDeck(deck);
        player9.getCardsFromDeck(deck);
        player10.getCardsFromDeck(deck);

        //HERE EXCEPTION
        player11.getCardsFromDeck(deck);
    }

}