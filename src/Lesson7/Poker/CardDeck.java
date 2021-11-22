package Lesson7.Poker;

public class CardDeck{

    public Card[] generateCard (String [] suit, String [] rank, Card [] deck){
    for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck [suit.length*i + j] = new Card (rank[i], suit[j]);
            }
    } return deck;
    }

    public Card[] shuffleDeck (String [] suit, String [] rank, Card [] deck){
        for (int i = 0; i < 100; i++) {
            //int r = i + (int) (Math.random() * (52-i)); // случайная карта в колоде
            int in = (int)((Math.random()*52));
            int out = (int)((Math.random()*52));
            Card temp = deck[in];
            deck[in] = deck[out];
            deck[out] = temp;
        }
        return deck;
    }
}

