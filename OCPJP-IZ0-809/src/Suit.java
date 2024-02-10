import java.time.LocalDate;

public enum Suit {
    SPADE(null), HEART(Color.RED),
    DIAMOND(Color.RED), CLUB(Color.BLACK);

    public Color color;

    Suit(Color c) {
        LocalDate d = LocalDate.now();
        color = c;

    }


    private enum Color {RED, BLACK}
}