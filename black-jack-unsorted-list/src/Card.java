public enum Card {

    As(11),
    King(10),
    Queen(10),
    Boy(10),
    Ten(10),
    Nine(9),
    Eight(8),
    Seven(7),
    Six(6),
    Five(5),
    Four(4),
    Three(3),
    Two(2);

    private final int value;

    Card(int val) {
        this.value = val;
    }

    public int getValue() {
        return this.value;
    }

}
