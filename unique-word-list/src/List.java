public class List {

    private Word head;
    private Word tail;

    public void addWord(Word word) {
        Word h = head;
        if (h == null) {
            head = word;
        } else {
            tail.next = word;
        }
        tail = word;
    }

    public boolean isWordPresent(Word word) {
        boolean found = false;
        Word h = head;
        if (h != null) {
            while (h != null && !h.word.equals(word.word)) {
                h = h.next;
            }
            if (h != null) {
                found = true;
            }
        }
        return found;
    }

    public void print() {
        Word h = head;
        if (h != null) {
            while (h != null) {
                System.out.println(h.word);
                h = h.next;
            }
        }
    }

}
