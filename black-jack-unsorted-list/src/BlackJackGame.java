import java.util.Random;

public class BlackJackGame {

    Card[] deckOfCards;
    int length;

    BlackJackGame() {
        this.length = 0;
        this.deckOfCards = new Card[52];
        for (Card c : Card.values()) {
            for (int i = 0; i < 4; i++) {
                this.deckOfCards[this.length] = c;
                length++;
            }
        }
    }

    Card takeCard() {
        Random rand = new Random();
        length--;
        int randomNum = rand.nextInt(0, length);
        Card[] deckOfCardsCopy = new Card[length];
        for (int i = 0; i < deckOfCardsCopy.length; i++) {
            if (i >= randomNum) {
                deckOfCardsCopy[i] = this.deckOfCards[i + 1];
            } else {
                deckOfCardsCopy[i] = this.deckOfCards[i];
            }
        }
        this.deckOfCards = deckOfCardsCopy;
        return this.deckOfCards[randomNum];
    }

    void printAvailableCards() {
        for (Card c : deckOfCards) {
            System.out.println(c.toString());
        }
    }

}
