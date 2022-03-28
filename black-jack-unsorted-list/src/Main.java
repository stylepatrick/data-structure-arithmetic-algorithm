public class Main {

    static final int playRounds = 3;

    public static void main(String[] args) {
        BlackJackGame blackJackGame = new BlackJackGame();

        Player one = new Player();
        Player two = new Player();

        for (int i = 0; i < playRounds; i++) {
            one.cardList.addCard(blackJackGame.takeCard());
            two.cardList.addCard(blackJackGame.takeCard());
        }

        if (Math.abs(one.cardList.cardSum() - 21) < Math.abs((two.cardList.cardSum() - 21))) {
            System.out.println("Player 1 won!");
        } else if (Math.abs(one.cardList.cardSum() - 21) > Math.abs(two.cardList.cardSum() - 21)) {
            System.out.println("Player 2 won!");
        } else {
            System.out.println("Both won's!");
        }

        System.out.println("-------Player 1-------");
        System.out.println(one.cardList.cardSum());
        one.cardList.printCards();

        System.out.println("-------Player 2-------");
        System.out.println(two.cardList.cardSum());
        two.cardList.printCards();
    }
}
