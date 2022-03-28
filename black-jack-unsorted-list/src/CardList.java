public class CardList {

    CardWrapper head;
    CardWrapper tail;

    void addCard(Card card) {
        CardWrapper e = new CardWrapper(card);
        if (head == null) {
            this.head = e;
        } else {
            tail.next = e;
        }
        this.tail = e;
    }

    int cardSum() {
        int val = 0;
        CardWrapper h = head;
        if (h != null) {
            while (h != null) {
                val = val + h.card.getValue();
                h = h.next;
            }
        }
        return val;
    }

    void printCards() {
        CardWrapper h = head;
        if (h != null) {
            while (h != null) {
                System.out.println(h.card.toString() + " - " + h.card.getValue());
                h = h.next;
            }
        }
    }

}
